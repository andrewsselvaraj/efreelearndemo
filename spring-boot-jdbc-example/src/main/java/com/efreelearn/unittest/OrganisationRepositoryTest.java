package com.efreelearn.unittest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.efreelearn.dao.OrganisationRepository;
import com.efreelearn.model.UserInfo;

public class OrganisationRepositoryTest {
	@Autowired
	OrganisationRepository organisationRepository;
	public List<UserInfo> getAllSchoolInfo()
	{
		List<UserInfo> userList=organisationRepository.findAll();
		return userList;
	}
	
	public static void main(String args[])
	{
		OrganisationRepositoryTest s = new OrganisationRepositoryTest();
		s.getAllSchoolInfo();
	}

}
