package com.efreelearn.unittest;

import org.springframework.beans.factory.annotation.Autowired;

import com.efreelearn.dao.SchoolInfoRepository;
import com.efreelearn.model.SchoolInfo;

public class SchoolCrud {
	
	//HibernateSessionFactory hsf = HttpSession.getSession();
	@Autowired
	SchoolInfoRepository sirepoJPA;
	
	public SchoolCrud()
	{

	}
	
	public void inserSchool(SchoolInfo objSchoolInfo) throws Exception{
		if(objSchoolInfo!=null)
		{
			System.out.println("cirty"+objSchoolInfo.getCity());
		sirepoJPA.save(objSchoolInfo);
		}
		else
		{
			System.out.println("null");
		}
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SchoolCrud s = new SchoolCrud();
		SchoolInfo si = new SchoolInfo();
		si.setPk_SchoolId(4651321);
 
 
		si.setUser_name("user_name"); 
 
		si.setPassword("password"); 
 
		si.setSchoolName("schoolName"); 
 
		si.setPrincipalName("principalName"); 
 
		si.setSchoolAddress("schoolAddress"); 
 
		si.setCity("city"); 
 
		si.setState("state"); 
 
		si.setCountry("country"); 
 
		si.setPincode("pincode");
 
		si.setEmail("email"); 
		si.setWebSite("webSite"); 
 
		si.setContactNo("contactNo"); 
 
		si.setCreatedby("createdby"); 
 
		si.setLastupdatedby("lastupdatedby"); 
 
		si.setLastupdateed("lastupdateed"); 
 
		si.setStatus("status"); 
 
		
		s.inserSchool(si);
		
	
	}

}
