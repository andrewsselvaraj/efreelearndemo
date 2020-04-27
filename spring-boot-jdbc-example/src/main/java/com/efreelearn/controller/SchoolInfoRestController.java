package com.efreelearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.OrganisationRepository;
import com.efreelearn.model.UserInfo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SchoolInfoRestController {
	
	@Autowired
	OrganisationRepository organisationRepository;
	
	@RequestMapping("/index")
	public String getSchoolInfo(String id)
	{
		return "empty";
	}
	

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

}
