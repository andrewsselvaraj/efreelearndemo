package com.efreelearn.mvccontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.efreelearn.model.Question;
import com.efreelearn.vo.AnswerResponse;
import com.efreelearn.vo.QuestionAnswersResponse;
import com.efreelearn.vo.QuestionResponse;
@Controller
@EnableAspectJAutoProxy
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
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")	
	@RequestMapping(value = "/postQuestionAndAnswers", method =  RequestMethod.POST)
	private String postQuestionAndAnswers(Map<String, Object> model)
	{
	String url = "https://spring-jdbc.cfapps.io/postQuestionAndAnswers";
	RestTemplate restTemplate = new RestTemplate();
	
	
	QuestionResponse q = new QuestionResponse();
	q.setAnswer_type("TEXT");
	q.setCreatedby("createdby");
	q.setDescription("description");
	q.setFk_SchoolId("1");
	q.setFk_SubjectId("1");
	q.setLastupdatedby("lastupdatedby");
	q.setLastupdateed("lastupdateed");
	q.setMedia_type("music");
	q.setPk_questionid("111");
	q.setQuestion_type("question_type");
	q.setQuestionName("Capital od india");
	q.setPk_questionid("345fs");
	
	AnswerResponse ans1 = new AnswerResponse();
	ans1.setAnswer("chennai");
	ans1.setCorrect_answer("Y");
	
	
	AnswerResponse ans2 = new AnswerResponse();
	ans2.setAnswer("chennai");
	ans2.setCorrect_answer("Y");
	
	AnswerResponse ans3 = new AnswerResponse();
	ans3.setAnswer("chennai");
	ans3.setCorrect_answer("Y");
	
	AnswerResponse a = new AnswerResponse();
	
	List<AnswerResponse> answerResponses = new ArrayList<AnswerResponse>();
	answerResponses.add(ans2);
	answerResponses.add(ans1);
	answerResponses.add(ans3);
	
	QuestionAnswersResponse qa = new QuestionAnswersResponse();
	
	qa.setQuestion(q);
	qa.setAnswers(answerResponses);
	
	
	
	

	QuestionAnswersResponse[] qaq=restTemplate.postForObject(url, qa,QuestionAnswersResponse[].class);
 
	return "allquestionAnswers";
	}
	
	// TODO Auto-generated method stub



}
