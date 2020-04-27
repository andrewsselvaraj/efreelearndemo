package com.efreelearn.model;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="subject_info")
public class SubjectInfo {
	@Id
	@Column (name="pk_SubjectId", nullable=false)
	  int pk_SubjectId;	
	@Column (name="SubjectName", nullable=false)
	  String SubjectName;
	@Column (name="fk_SchoolId", nullable=false)
	  int fk_SchoolId;
	@Column (name="description", nullable=false)
	  int description;
	@Column (name="createdby", nullable=false)
	  String createdby;
	@Column (name="lastupdatedby", nullable=false)
	  Date lastupdatedby;
	@Column (name="lastupdateed", nullable=false)
	  String lastupdateed;
	@Column (name="status", nullable=false)
	  String  status;
	public int getPk_SubjectId() {
		return pk_SubjectId;
	}
	public void setPk_SubjectId(int pk_SubjectId) {
		this.pk_SubjectId = pk_SubjectId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public int getFk_SchoolId() {
		return fk_SchoolId;
	}
	public void setFk_SchoolId(int fk_SchoolId) {
		this.fk_SchoolId = fk_SchoolId;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
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
