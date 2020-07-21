package com.itogge.demo.demospringboot.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.itogge.demo.demospringboot.common.DataResult;

@RestControllerAdvice
public class ItoggeExceptionHandler {

	public static final String ERROR_VIEW = "error";
	
	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) {
		e.printStackTrace();
		
		if (isAjax(request)) {
			return DataResult.exception(e.getMessage());
    	} else {
    		ModelAndView mv = new ModelAndView(ERROR_VIEW);
    		mv.addObject("exception", e);
    		mv.addObject("url", request.getRequestURL());
    		return mv;
    	}
	}
	
	/**
	 * 判断是否时Ajax请求
	 * @param httpRequest
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest httpRequest){
		return  (httpRequest.getHeader("X-Requested-With") != null  
					&& "XMLHttpRequest".equals( httpRequest.getHeader("X-Requested-With").toString()) );
	}
	
}
