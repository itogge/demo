package com.itogge.demo.demospringboot.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.itogge.demo.demospringboot.common.DataResult;

//@RestControllerAdvice
public class AjaxExceptionHandler {

	public static final String ERROR_VIEW = "error";
	
	//@ExceptionHandler(value = Exception.class)
	public DataResult errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) {
		e.printStackTrace();
		return DataResult.exception(e.getMessage());
	}
	
}
