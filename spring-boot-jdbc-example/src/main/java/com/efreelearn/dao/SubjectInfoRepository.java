package com.efreelearn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efreelearn.model.SubjectInfo;
@Repository
public interface SubjectInfoRepository extends JpaRepository<SubjectInfo,Integer>{

}


