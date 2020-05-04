package com.efreelearn.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.efreelearn.model.UserInfo;
import com.efreelearn.model.UserInfoNew;



 

@Controller
@EnableAspectJAutoProxy  
public class LoginController {
	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/loginNew2")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/nextNew2")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}
	
	

	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserNew1", method =  RequestMethod.POST)
	private String validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		log.info("ANDREW ERROR");
		System.out.println("ANDREW ERROR SOP");
	    final String uri = "https://spring-jdbc.cfapps.io/validateUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	   
	    
	   
	    
	    return "next";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserPostforObjectNew1", method =  RequestMethod.GET)
	private String validateUserPostforObject(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
	    final String url = "https://spring-jdbc.cfapps.io/validateUserDummy";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("userName", userName);
	    uriVariables.put("password", password);
	   // URI result = restTemplate.postForLocation(uri, String.class, vars);
	    String result = restTemplate.getForObject(url, String.class, uriVariables);
	  //  restTemplate.postForObject(url, request, responseType, uriVariables)
	 
	    
	    //System.out.println(result.getRawQuery());
	    return "index";
	}
	
	@RequestMapping(value ="validateUserandLogin", method =  RequestMethod.POST)
	public String validateUserandLogin(Map<String, Object> model)	
	{
		final String url = "https://spring-jdbc.cfapps.io/loginUser";
		
		
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("userName", "shirly");
	    uriVariables.put("password", "shirly");
	   UserInfo user= new UserInfo();
	    user.setName("shirly");
	    user.setName("password");
	   // URI result = restTemplate.postForLocation(uri, String.class, vars);
	    //String result = restTemplate.postForObject(url, String.class, null, uriVariables);
	    UserInfoNew u=restTemplate.postForObject(url, user, UserInfoNew.class);
	   
	    model.put("message", u);
		return "onlineExam";
	}
	
	@RequestMapping(value = "initiateLogin", method =  RequestMethod.GET)
	public String initiateLogin(Model model)	
	{
		log.info("ANDREW ERROR INFOG");
		System.out.println("ANDREW ERROR SOP");
		log.error("ANDREW ERROR INFOG");
		return "login";
	}

}