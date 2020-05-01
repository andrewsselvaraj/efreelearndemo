package com.efreelearn.model;
import javax.persistence.*;

@Entity
@Table(name="answer_info")
public class Answer {
	
	@Id
	@Column(name="pk_answerid", unique=true, nullable=false)
	String pk_answerid;
	@Column (name="fk_questionid",nullable=false)
	String fk_questionid;
	@Column (name="fk_SchoolId",nullable=false)
	String fk_SchoolId;
	@Column (name="fk_SubjectID", nullable=false)
	String fk_SubjectID;
	
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	String correct_answer;
	String answer;
	
	public String getPk_answerid() {
		return pk_answerid;
	}
	public void setPk_answerid(String pk_answerid) {
		this.pk_answerid = pk_answerid;
	}
	public String getFk_questionid() {
		return fk_questionid;
	}
	public void setFk_questionid(String fk_questionid) {
		this.fk_questionid = fk_questionid;
	}
	public String getFk_SchoolId() {
		return fk_SchoolId;
	}
	public void setFk_SchoolId(String fk_SchoolId) {
		this.fk_SchoolId = fk_SchoolId;
	}
	public String getFk_SubjectID() {
		return fk_SubjectID;
	}
	public void setFk_SubjectID(String fk_SubjectID) {
		this.fk_SubjectID = fk_SubjectID;
	}


}
