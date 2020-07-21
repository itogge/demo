package com.itogge.demofreemarker.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itogge.demofreemarker.domain.SortMethod;

@Controller
@RequestMapping(value = "/")
public class Cp2Controller {

	@RequestMapping("/cp2")
	public ModelAndView cp1(){
		ModelAndView mv = new ModelAndView("cp2");
		mv.addObject("sort_int",new SortMethod());
		return mv;
	}
	
	private Map<String, String> loadLanguageMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Python", "人生苦短，我用Python");
		map.put("PHP", "PHP是世界上最好的语言");
		map.put("Java", "谁，谁在说话");
		return map;
	}
	
}
