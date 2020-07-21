package com.itogge.demo.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itogge.demo.demospringboot.common.DataResult;

@Controller
@RequestMapping(value="err")
public class ErrorController {
	
	@RequestMapping("/error")
	public String error() {
		int a = 1 / 0 ;
		return "thymeleaf/error";
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		return "thymeleaf/ajaxerror";
	}
	
	@RequestMapping("/getAjaxerror")
	public DataResult getAjaxerror() {
		
		int a = 1 / 0;
		
		return DataResult.ok();
	}
}
