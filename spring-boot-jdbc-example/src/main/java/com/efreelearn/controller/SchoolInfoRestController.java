package com.efreelearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolInfoRestController {
	
	@RequestMapping("/index")
	public String getSchoolInfo(String id)
	{
		return "empty";
	}

}
