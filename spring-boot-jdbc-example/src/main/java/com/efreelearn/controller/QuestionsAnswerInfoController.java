package com.efreelearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.QuestionsRepository;
import com.efreelearn.model.QuestionAnswers;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class QuestionsAnswerInfoController {
	
	@Autowired
	QuestionsRepository questionsRepository;

	

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/findAllQuestionwithAnswers")
	public List<QuestionAnswers> findAllQuestionwithAnswers()
	{
		List<QuestionAnswers> userList=questionsRepository.findAllQuestionwithAnswers("pk_SubjectId", "fk_SchoolId");
		return userList;
	}
	
	

}
