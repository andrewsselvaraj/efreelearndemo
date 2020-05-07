package com.efreelearn.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.dao.QuestionAnswersRepository;
import com.efreelearn.model.QuestionAnswers;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class QuestionsAnswerInfoController {
	
	@Autowired
	QuestionAnswersRepository questionAnswersRepository;

	

 
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/findAllQuestionwithAnswerforAll", method =  RequestMethod.GET)
	public List<QuestionAnswers> findAllQuestionwithAnswerforAll()
	{
		List<QuestionAnswers> userList=questionAnswersRepository.findAllQuestionwithAnswerforAll("pk_SubjectId", "fk_schoolid");
		return userList;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/findAllQuesAansbySchoolIDSubjecID", method =  RequestMethod.GET)
	public List<QuestionAnswers> findAllQuesAansbySchoolIDSubjecID(@RequestParam("pk_SubjectId") String pk_SubjectId, @RequestParam("pk_SchoolId") String fk_schoolid)
	{
		List<QuestionAnswers> userList=questionAnswersRepository.findAllQuesAansbySchoolIDSubjecID(pk_SubjectId, fk_schoolid);
		return userList;
	}
	
	
	
	

}
