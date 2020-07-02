package com.efreelearn.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.LoginRepository;
import com.efreelearn.model.UserInfo;
import com.efreelearn.vo.User;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LoginInfoRestController {
	
	@Autowired
	LoginRepository loginRepository;
	

	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUser", method =  RequestMethod.POST)
	public List<UserInfo> validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		try
		{
			System.out.println("Welcome");
		List<UserInfo> userList=loginRepository.validateUser(userName, password);
		if(userList!=null && userList.size() > 0)
		{
			System.out.println(userList.get(0).getName());
		}
		return userList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("getUserInfo()"+e.getStackTrace()+""+e.getMessage());
		}
		return null;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserandLoginRest", method =  RequestMethod.POST)
	public UserInfo validateUser(@RequestBody User user)
	{
		try
		{
			System.out.println("Welcome");
		List<UserInfo> userList=loginRepository.validateUser(user.getUsername(), user.getPassword());
		if(userList!=null && userList.size() > 0)
		{
			System.out.println(userList.get(0).getName());
			return userList.get(0);
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("getUserInfo()"+e.getStackTrace()+""+e.getMessage());
		}
		return null;
	}
	
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserDummy", method =  RequestMethod.GET)
	public List<UserInfo> validateUserDummy(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		try
		{
		List<UserInfo> userList=loginRepository.validateUser(userName, password);
		return userList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/loginTest")
	public String loginTest()
	{
 
		return "loginTest";
	}
	/*
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/loginUser", method =  RequestMethod.POST)
	public UserInfo loginUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		try
		{
		 UserInfo  user=loginRepository.loginUser(userName, password);
		return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	*/
	
	 
}
