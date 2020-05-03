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

import com.efreelearn.vo.UserVONew;

@Controller
public class LoginController {

	@RequestMapping("/login")
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
	@RequestMapping(value = "/loginUser", method =  RequestMethod.POST)
	private String loginUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		
	    final String url = "http://localhost:2222/loginUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("userName", userName);
	    uriVariables.put("password", password);
	    
	    UserVONew result =  restTemplate.getForObject(url, UserVONew.class, uriVariables);
	    System.out.println(result);	    
	    
	   
	    
	    return "next";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUser", method =  RequestMethod.POST)
	private String validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		
	    final String uri = "https://spring-jdbc.cfapps.io/validateUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	   
	    
	   
	    
	    return "next";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserPostforObject", method =  RequestMethod.GET)
	private String validateUserPostforObject(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
	    final String uri = "https://spring-jdbc.cfapps.io/validateUserDummy";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	    URI result = restTemplate.postForLocation(uri, String.class, vars);
	 
	    
	    System.out.println(result.getRawQuery());
	   return "index";
	}

}