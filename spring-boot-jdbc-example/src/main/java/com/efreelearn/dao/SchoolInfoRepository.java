package com.efreelearn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efreelearn.model.SchoolInfo;
@Repository
public interface SchoolInfoRepository extends JpaRepository<com.efreelearn.model.SchoolInfo,Integer>{
	

  
}
