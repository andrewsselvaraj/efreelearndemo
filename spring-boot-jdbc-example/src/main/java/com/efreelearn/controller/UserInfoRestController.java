package com.efreelearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.LoginRepository;
import com.efreelearn.dao.OrganisationRepository;
import com.efreelearn.dao.UserInfoRepository;
import com.efreelearn.model.UserInfo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserInfoRestController {
	
	@Autowired
	LoginRepository loginRepository;
	

	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
 
	@RequestMapping(value = "/validateUser", method =  RequestMethod.POST)
	public List<UserInfo> validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		List<UserInfo> userList=loginRepository.validateUser(userName, password);
		return userList;
	}
	
	
	
	 
}
