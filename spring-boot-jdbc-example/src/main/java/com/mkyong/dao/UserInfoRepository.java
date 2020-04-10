package com.mkyong.dao;

import com.mkyong.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class UserInfoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserInfo> findAll() {

        List<UserInfo> result = jdbcTemplate.query(
                "SELECT pk_user_id, user_name, email_id, created_datettime FROM user_info",
                (rs, rowNum) -> new UserInfo(rs.getInt("pk_user_id"),
                        rs.getString("user_name"), rs.getString("email_id"), rs.getDate("created_datettime"))
        );

        return result;

    }

    public void addCustomer(String id,String name, String email) {
/*
        jdbcTemplate.update("INSERT INTO user_info(pk_user_id,user_name, email_id, created_datettime) VALUES (?,?,?)",
                name, email, new Date());*/

    }


}
