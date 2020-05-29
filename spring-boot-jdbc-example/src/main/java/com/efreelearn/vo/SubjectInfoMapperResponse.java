package com.efreelearn.vo;

import java.util.*;
 
 
public class SubjectInfoMapperResponse {
 
	  Long pk_SubjectId;
	 
	  String subjectname;
 
	  int fk_schoolid;
 
	String description;
 
	  String createdby;
 
	  Date lastupdatedby;
	 
	  String lastupdateed;
 
	  String  status;
	public Long getPk_SubjectId() {
		return pk_SubjectId;
	}
	public void setPk_SubjectId(Long pk_SubjectId) {
		this.pk_SubjectId = pk_SubjectId;
	}
	public String getSubjectName() {
		return subjectname;
	}
	public void setSubjectName(String subjectName) {
		subjectname = subjectName;
	}
	public int getFk_SchoolId() {
		return fk_schoolid;
	}
	public void setFk_SchoolId(int fk_SchoolId) {
		this.fk_schoolid = fk_SchoolId;
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
	public Date getLastupdatedby() {
		return lastupdatedby;
	}
	public void setLastupdatedby(Date lastupdatedby) {
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


}
