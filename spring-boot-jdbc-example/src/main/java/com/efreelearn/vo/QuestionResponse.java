package com.efreelearn.vo;



 
public class QuestionResponse {
	public String getPk_questionid() {
		return pk_questionid;
	}
	public void setPk_questionid(String pk_questionid) {
		this.pk_questionid = pk_questionid;
	}
	public String getQuestionName() {
		return QuestionName;
	}
	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}
	public String getFk_SchoolId() {
		return fk_SchoolId;
	}
	public void setFk_SchoolId(String fk_SchoolId) {
		this.fk_SchoolId = fk_SchoolId;
	}
	public String getFk_SubjectId() {
		return fk_SubjectId;
	}
	public void setFk_SubjectId(String fk_SubjectId) {
		this.fk_SubjectId = fk_SubjectId;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getLastupdatedby() {
		return lastupdatedby;
	}
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	public String getLastupdateed() {
		return lastupdateed;
	}
	public void setLastupdateed(String lastupdateed) {
		this.lastupdateed = lastupdateed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
 
	String QuestionName=""; 

	
	public String getAnswer_type() {
		return answer_type;
	}
	public void setAnswer_type(String answer_type) {
		this.answer_type = answer_type;
	}
	public String getMedia_type() {
		return media_type;
	}
	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}
 
	String pk_questionid="";
	String answer_type=""; 
	
	 
	String media_type=""; 
	
	
	 
	String fk_SchoolId = "";
 
	String fk_SubjectId = "";
 
	String question_type =""; 
	 
	String description = "";
 
	String createdby = "";
	 
	String lastupdatedby ="";
	 
	String lastupdateed =""; 

	String status =""; 
}
