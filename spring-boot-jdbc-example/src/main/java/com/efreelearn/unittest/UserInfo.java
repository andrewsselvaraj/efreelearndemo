package com.efreelearn.unittest;

import org.springframework.web.client.RestTemplate;

import com.efreelearn.vo.UserResponse;

public class UserInfo {

	public static void main(String[] args) {
		String url = "https://efreelearn.cfapps.io/validateUserDummy?userName=shirly&password=shirly";
		RestTemplate restTemplate = new RestTemplate();
		UserResponse[] u = restTemplate.getForObject(url, UserResponse[].class);
		System.out.println("aaa "+u[0].getEmail());

	
		
		// TODO Auto-generated method stub

	}

}
