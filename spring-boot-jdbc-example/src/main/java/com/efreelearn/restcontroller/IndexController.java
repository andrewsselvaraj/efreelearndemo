package com.efreelearn.restcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.efreelearn.vo.User;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("user", new User());
		//model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}

}