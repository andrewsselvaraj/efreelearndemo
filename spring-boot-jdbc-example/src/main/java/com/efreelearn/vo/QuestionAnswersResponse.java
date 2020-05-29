package com.efreelearn.vo;

import java.util.List;

public class QuestionAnswersResponse {
	QuestionResponse questionResponse;
	List<AnswerResponse> answerResponses;
	public QuestionResponse getQuestion() {
		return questionResponse;
	}
	public void setQuestion(QuestionResponse questionResponse) {
		this.questionResponse = questionResponse;
	}
	public List<AnswerResponse> getAnswers() {
		return answerResponses;
	}
	public void setAnswers(List<AnswerResponse> answerResponses) {
		this.answerResponses = answerResponses;
	}
 

}
