package com.itogge.demo.demospringboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itogge.demo.demospringboot.common.DataResult;
import com.itogge.demo.demospringboot.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/user")
	public User getUser() {
		User u = new User("张三","mima123",23,new Date(),"我可是一个帅哥");
		return u;
	}
	
	@RequestMapping("/userresult")
	public DataResult getUserResult() {
		User u = new User("张三","mima123",23,new Date(),null);
		return DataResult.ok(u);
	}
	
}
