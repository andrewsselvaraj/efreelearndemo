package com.efreelearn.mvccontroller;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.efreelearn.dao.SubjectInfoRepository;
import com.efreelearn.model.SubjectInfo;


@Controller
@EnableAspectJAutoProxy  
public class SubjectController {
	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());

	 @Autowired
	 SubjectInfoRepository subjectInfoRepository;

	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/insertSubject", method =  RequestMethod.GET)
	private String insertSubject()
	{
		SubjectInfo subjectInfo = new SubjectInfo();
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		long randomNum = rand.nextInt((10000 - 10) + 1) + 10;
		subjectInfo.setPk_SubjectId(randomNum);
		subjectInfo.setSubjectName("subjectName"+randomNum);
		subjectInfo.setFk_SchoolId(0);
		java.util.Date date=new java.util.Date();  
		//subjectInfo.setLastupdatedby(date);
		subjectInfo.setLastupdateed("lastupdateed");
		subjectInfo.setStatus("1");
		subjectInfo.setCreatedby("andrews");
		subjectInfo.setDescription("description");
		
		subjectInfoRepository.save(subjectInfo);
	   
	    
	   
	    
	    return "allSubject";
	}
	



}