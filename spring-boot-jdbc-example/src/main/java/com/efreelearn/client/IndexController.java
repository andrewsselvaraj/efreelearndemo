package com.efreelearn.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

	@RequestMapping("/in")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUser", method =  RequestMethod.POST)
	private static void validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
	    final String uri = "https://jdbc-apps.cfapps.io/validateUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	    URI result = restTemplate.postForLocation(uri,  vars);
	 
	    
	    System.out.println(result.getRawQuery());
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserPostforObject", method =  RequestMethod.GET)
	private static void validateUserPostforObject(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
	    final String uri = "https://jdbc-apps.cfapps.io/validateUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	    URI result = restTemplate.postForLocation(uri, String.class, vars);
	 
	    
	    System.out.println(result.getRawQuery());
	}

}