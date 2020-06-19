package com.efreelearn.unittest;

import org.springframework.web.client.RestTemplate;

import com.efreelearn.model.SubjectInfo;
import com.efreelearn.vo.QuestionAnswersResponse;
import com.efreelearn.vo.QuestionResponse;



public class QuestionandAnswerInfo {

	public static void main(String[] args) {
		String url = "https://efreelearn.cfapps.io/findAllQuestionwithAnswerforAll";
		RestTemplate restTemplate = new RestTemplate();


		QuestionAnswersResponse[] qa=restTemplate.getForObject(url, QuestionAnswersResponse[].class);
		System.out.println("qqq"+qa.length);
		QuestionResponse q= qa[0].getQuestion();
		System.out.println("aaaa"+q.getQuestionName());
		
		// TODO Auto-generated method stub

	}
	
	
}
