package com.efreelearn.response;

import java.util.List;

public class QuestionAnswers {
	Question question;
	List<Answer> answers;
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
 

}
