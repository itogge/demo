package com.itogge.demo.demospringboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itogge.demo.demospringboot.pojo.User;

@Controller
@RequestMapping(value = "th")
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("name", "张三");
		
		return "thymeleaf/index";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		
		User user = new User("张三","mima123",23,new Date(),"我可是一个帅哥");
		
		model.addAttribute("user", user);
		
		return "thymeleaf/test";
	}
	
	@RequestMapping("/postform")
	public String test(User user) {
		
		System.out.println(user.toString());
		
		return "redirect:/th/test";
	}
	
	
}
