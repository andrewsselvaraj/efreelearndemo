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
import com.efreelearn.model.UserInfo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SchoolInfoRestController {
	
	@Autowired
	OrganisationRepository organisationRepository;
	@Autowired 
	LoginRepository loginRepository;
	@RequestMapping("/getSchoolInfobyId")
	public String getSchoolInfo(String id)
	{
		return "empty";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/allSchoolInfo")
	public List<UserInfo> getAllSchoolInfo()
	{
		List<UserInfo> userList=organisationRepository.findAll();
		return userList;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/allSchoolInfoNew")
	public List<UserInfo> getAllSchoolInfoNew()
	{
		List<UserInfo> userList=organisationRepository.findAll();
		return userList;
	}
	
	@RequestMapping("/apNew")
    public  ArrayList<String> addtionalPath() {
    	ArrayList<String> al = new ArrayList<String>();
    	al.add("arg0");al.add("arg1");
        return al;
    }
	@RequestMapping("/allSchoolInfo2")
	public List<UserInfo> getAllSchoolInfo2()
	{
		List<UserInfo> userList=organisationRepository.findAll();
		return userList;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUser1", method =  RequestMethod.POST)
	public List<UserInfo> validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		List<UserInfo> userList=loginRepository.validateUser(userName, password);
		return userList;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/loginTest1")
	public String loginTest()
	{
 
		return "loginTest1";
	}

}
