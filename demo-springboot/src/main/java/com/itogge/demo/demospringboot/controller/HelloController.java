package com.itogge.demo.demospringboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itogge.demo.demospringboot.common.DataResult;
import com.itogge.demo.demospringboot.common.Resource;

@RestController
public class HelloController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/getResource")
	public DataResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return DataResult.ok(bean);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
	
	
}
