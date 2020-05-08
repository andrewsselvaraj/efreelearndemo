package com.efreelearn.restcontroller;

import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.efreelearn.dao.SubjectInfoRepository;
import com.efreelearn.model.SubjectInfo;

@Controller
public class SubjectRestController {


	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());

	 @Autowired
	 SubjectInfoRepository subjectInfoRepository;
	 
		@CrossOrigin(origins = "*", allowedHeaders = "*") 
		@RequestMapping(value = "/loadSubjectEntry", method =  RequestMethod.GET)
		private String loadSubjectEntryScreen(Map<String, Object> model)
		{
			
		   
		    
		   
		    
		    return "postSubject";
		}

	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/postSubject", method =  RequestMethod.POST,headers = {"content-type=application/json,application/x-www-form-urlencoded"})
	private String postSubject(@RequestBody SubjectInfo subjectInfo)
	{
 
		  subjectInfo = new SubjectInfo();
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		long randomNum = rand.nextInt((10000 - 10) + 1) + 10;
		subjectInfo.setPk_SubjectId(randomNum);
		subjectInfo.setSubjectName("subjectName"+randomNum);
		subjectInfo.setFk_SchoolId(0L);
		java.util.Date date=new java.util.Date();  
		//subjectInfo.setLastupdatedby(date);
		subjectInfo.setLastupdateed("lastupdateed");
		subjectInfo.setStatus("1");
		subjectInfo.setCreatedby("andrewsPOSY SUBJECT");
		subjectInfo.setDescription("-"+subjectInfo.getDescription());
		
		subjectInfoRepository.save(subjectInfo);
	   
	    
	   
	    
	    return "allSubject";
	}
	






}