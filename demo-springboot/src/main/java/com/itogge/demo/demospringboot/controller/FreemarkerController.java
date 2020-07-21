package com.itogge.demo.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "ftl")
public class FreemarkerController {

	@RequestMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("name", "张三");
		
		return "thymeleaf/index";
	}
	
}
