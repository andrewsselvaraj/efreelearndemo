package com.efreelearn.unittest;

import java.net.URI;
import java.util.Random;

import org.springframework.web.client.RestTemplate;

import com.efreelearn.model.SubjectInfo;
import com.efreelearn.vo.SubjectInfoMapperResponse;




public class SubjectInfoUnitTest {

	public static void main(String[] args) {

		String url = "http://spring-jdbc.cfapps.io/postSubject";
		RestTemplate restTemplate = new RestTemplate();
		
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

		 restTemplate.postForObject(url, subjectInfo, SubjectInfoMapperResponse.class);
		 
		// URI uri=restTemplate.postForLocation(url, subjectInfo);
		 
		
		//System.out.println("aaa"+unmarshalledSubject.getFk_SchoolId());


		
		// TODO Auto-generated method stub

	}
	
	
}
