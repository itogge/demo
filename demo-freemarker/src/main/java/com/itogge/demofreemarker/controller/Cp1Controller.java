package com.itogge.demofreemarker.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itogge.demofreemarker.domain.User;

@Controller
@RequestMapping(value = "/")
public class Cp1Controller {

	@RequestMapping("/cp1")
	public ModelAndView cp1(){
		
		ModelAndView mv = new ModelAndView("cp1");
		//整数
		mv.addObject("intVar",1233);
		//长整数
		mv.addObject("longVar",1233456789L);
		//字符串
		mv.addObject("stringVar","我是字符串");
		//双精度
		mv.addObject("doubleVar",3.45d);
		//日期
		mv.addObject("dateVar",new Date());
		//null
		mv.addObject("nullVar",null);
		//boolean
		mv.addObject("booleanVar", true);
		
		User user = new User();
		user.setUsername("张三");
		user.setBirthday(new Date());
		user.setRemark("<font color=\"red\">这是备注</font><br/>");
		mv.addObject("userObject", user);
		
		List<String> strList = new ArrayList<String>();
		strList.add("Python");
		strList.add("Java");
		strList.add("PHP");
		mv.addObject("strList", strList);

		mv.addObject("map", this.loadLanguageMap());
		
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
