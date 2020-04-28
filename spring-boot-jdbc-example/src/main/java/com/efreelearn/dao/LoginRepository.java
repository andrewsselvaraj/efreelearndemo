package com.efreelearn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.efreelearn.model.UserInfo;

import java.util.Date;
import java.util.List;

@Repository
public class LoginRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserInfo> validateUser(String userName,String password) {
    	 List<UserInfo> result=null;
    	try
    	{
    	String sql ="SELECT pk_user_id, user_name, password,email_id, created_datettime FROM user_info where ";
    	sql = sql + "  user_name = '" + userName+"' and ";
    	sql = sql + "password = '" + password +"' ";
    	System.out.println("sql"+sql);
    	result = jdbcTemplate.query( sql,
                (rs, rowNum) -> new UserInfo(rs.getInt("pk_user_id"),
                        rs.getString("user_name"), rs.getString("password"), rs.getDate("created_datettime"))
        );
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}

        return result;

    }

    public void addCustomer(String id,String name, String email) {
/*
        jdbcTemplate.update("INSERT INTO user_info(pk_user_id,user_name, email_id, created_datettime) VALUES (?,?,?)",
                user_name, email, new Date());*/

    }


}
