package com.efreelearn.client;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.efreelearn.vo.QuestionAnswersResponse;
import com.efreelearn.vo.QuestionResponse;

public class QuestionAnswerInfoController {
	
	

	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	
	@RequestMapping(value = "/getAllQuestionAnswers", method =  RequestMethod.GET)
	private String validateUser(Map<String, Object> model)
	{
	String url = "https://spring-jdbc.cfapps.io/findAllQuestionwithAnswerforAll";
	RestTemplate restTemplate = new RestTemplate();


	QuestionAnswersResponse[] qa=restTemplate.getForObject(url, QuestionAnswersResponse[].class);
	System.out.println("qqq 111"+qa.length);
	QuestionResponse q= qa[0].getQuestion();
	System.out.println("aaaa 111"+q.getQuestionName());
	model.put("allquestionAnswers", qa);
	return "allquestionAnswers";
	}
	
	// TODO Auto-generated method stub



}
