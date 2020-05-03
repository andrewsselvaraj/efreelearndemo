package com.efreelearn.vo;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class TEST {
	
	public static void main(String args[])
	{
final String url = "http://localhost:2222/loginUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("userName", "shirly");
	    uriVariables.put("password", "shirly");
	    
	    URI result =  restTemplate.postForLocation(url, UserVONew.class, uriVariables);
	    System.out.println(result);	 
	}
	
}
