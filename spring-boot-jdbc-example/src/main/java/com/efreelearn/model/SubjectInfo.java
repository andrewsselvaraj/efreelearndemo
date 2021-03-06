package com.efreelearn.model;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="subject_info")
public class SubjectInfo {
	@Id
	@Column (name="pk_Subjectid", nullable=false)
	  Long pk_SubjectId;
	@Column (name="Subjectname", nullable=false)
	  String subjectname;
	@Column (name="fk_schoolid", nullable=false)
	Long fk_schoolid;
	@Column (name="classid", nullable=true)
	Long classid;
	
	@Column (name="classname", nullable=true)
	String classname;
	@Column (name="description", nullable=false)
	String description;
	@Column (name="createdby", nullable=false)
	  String createdby;
	@Column (name="lastupdatedby", nullable=true)
	  Date lastupdatedby;
	@Column (name="lastupdateed", nullable=false)
	  String lastupdateed;
	@Column (name="status", nullable=false)
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
	public Long getFk_SchoolId() {
		return fk_schoolid;
	}
	public void setFk_SchoolId(Long fk_SchoolId) {
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

	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public Long getFk_schoolid() {
		return fk_schoolid;
	}
	public void setFk_schoolid(Long fk_schoolid) {
		this.fk_schoolid = fk_schoolid;
	}
	public Long getClassid() {
		return classid;
	}
	public void setClassid(Long classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
