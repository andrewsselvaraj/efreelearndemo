package com.efreelearn.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
 
import org.springframework.stereotype.Repository;

 

 
import com.efreelearn.model.QuestionAnswers;
 
 

@Repository
public class QuestionAnswersRepositoryJPA extends JpaRepositoryFactory  {

	public QuestionAnswersRepositoryJPA(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
}

