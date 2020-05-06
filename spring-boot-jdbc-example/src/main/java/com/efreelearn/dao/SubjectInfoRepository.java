package com.efreelearn.dao;

import org.springframework.stereotype.Repository;

import com.efreelearn.model.SubjectInfo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository   
public interface SubjectInfoRepository extends JpaRepository<SubjectInfo, Long>   
{
	
}


