package com.efreelearn.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/findAllQuesAansbySchoolIDSubjecIDClassID", method =  RequestMethod.GET)
	public List<QuestionAnswers> findAllQuesAansbySchoolIDSubjecIDClassID(@RequestParam("pk_SubjectId") String pk_SubjectId, @RequestParam("pk_SchoolId") String fk_schoolid,@RequestParam("classid") String classid)
	{
		List<QuestionAnswers> userList=questionAnswersRepository.findAllQuesAansbySchoolIDSubjecIDClassID(pk_SubjectId, fk_schoolid,classid);
		return userList;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/insertQuestionAnswers", method =  RequestMethod.POST)
	public String insertQuestionAnswers(@RequestBody QuestionAnswers questionAnswers)
	{

		String resturnstratus=questionAnswersRepository.insertQuestionAnswers(questionAnswers);
		return resturnstratus;
	}
	
	
	
	
	

}
