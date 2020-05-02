package com.efreelearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.QuestionAnswersRepository;
import com.efreelearn.model.QuestionAnswers;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class QuestionsAnswerInfoController {
	
	@Autowired
	QuestionAnswersRepository questionAnswersRepository;

	

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/findAllQuestionwithAnswers", method =  RequestMethod.GET)
	public List<QuestionAnswers> findAllQuestionwithAnswers()
	{
		List<QuestionAnswers> userList=questionAnswersRepository.findAllQuestionwithAnswers("pk_SubjectId", "fk_SchoolId");
		return userList;
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/findAllQuestionwithAnswerforAll", method =  RequestMethod.GET)
	public List<QuestionAnswers> findAllQuestionwithAnswerforAll()
	{
		List<QuestionAnswers> userList=questionAnswersRepository.findAllQuestionwithAnswerforAll("pk_SubjectId", "fk_SchoolId");
		return userList;
	}
	
	

}
