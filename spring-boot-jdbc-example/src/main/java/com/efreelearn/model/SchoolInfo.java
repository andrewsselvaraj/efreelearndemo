package com.efreelearn.model;

import javax.persistence.*;

@Entity
@Table (name="school_info")
public class SchoolInfo {
	@Id
	@Column (name="pk_SchoolId", nullable=false)
	int pk_SchoolId;
	@Column (name="user_name", nullable=false)
	String user_name;
	@Column (name="password", nullable=false)
	String password;
	@Column (name="SchoolName", nullable=false)
	String SchoolName;
	@Column (name="PrincipalName", nullable=false)
	String PrincipalName;
	@Column (name="SchoolAddress", nullable=false)
	String SchoolAddress;
	@Column (name="City", nullable=false)
	String City;
	@Column (name="State", nullable=false)
	String State;
	@Column (name="Country", nullable=false)
	String Country;
	@Column (name="Pincode", nullable=false)
	String Pincode;
	@Column (name="Email", nullable=false)
	String Email;
	@Column (name="WebSite", nullable=false)
	String WebSite;
	@Column (name="ContactNo", nullable=false)
	String ContactNo;
	@Column (name="createdby", nullable=false)
	String createdby;
	@Column (name="lastupdatedby", nullable=false)
	String lastupdatedby;
	@Column (name="lastupdateed", nullable=false)
	String lastupdateed;
	@Column (name="status", nullable=false)
	String status;
	public int getPk_SchoolId() {
		return pk_SchoolId;
	}
	public void setPk_SchoolId(int pk_SchoolId) {
		this.pk_SchoolId = pk_SchoolId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getPrincipalName() {
		return PrincipalName;
	}
	public void setPrincipalName(String principalName) {
		PrincipalName = principalName;
	}
	public String getSchoolAddress() {
		return SchoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		SchoolAddress = schoolAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getWebSite() {
		return WebSite;
	}
	public void setWebSite(String webSite) {
		WebSite = webSite;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
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


}
