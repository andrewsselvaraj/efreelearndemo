package com.efreelearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="question_info" )
public class Question {
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
	@Id
	@Column(name="pk_questionid",nullable=false)
	String pk_questionid="";
	@Column(name="QuestionName",nullable=false)
	String QuestionName=""; 
	@Column(name="fk_SchoolId",nullable=false)
	String fk_SchoolId = "";
	@Column(name="fk_SubjectId",nullable=false)
	String fk_SubjectId = "";
	@Column(name="question_type",nullable=false)
	String question_type =""; 
	@Column(name="description",nullable=false)
	String description = "";
	@Column(name="createdby",nullable=false)
	String createdby = "";
	@Column(name="lastupdatedby",nullable=false)
	String lastupdatedby ="";
	@Column(name="lastupdateed",nullable=false)
	String lastupdateed =""; 
	@Column(name="status",nullable=true)
	String status =""; 
}
