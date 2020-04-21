package com.efreelearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="question_info" )
public class Question {
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
