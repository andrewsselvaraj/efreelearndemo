package com.efreelearn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.efreelearn.model.UserInfo;

import java.util.List;

@Repository
public class OrganisationRepository {

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

    public void addOrganisation(String pk_SchoolId, String password, String SchoolName, String PrincipalName, String SchoolAddress, String City, String State, String Country, String Pincode, String Email, String Website, String ContactNo, String createdby, String lastupdateed, String status) {
    	
    	String sql = "INSERT INTO `school_info` (`pk_SchoolId`, `password`, `SchoolName`, `PrincipalName`, `SchoolAddress`, `City`, `State`, `Country`, `Pincode`, `Email`, `Website`, `ContactNo`, `createdby`, `lastupdateed`, `status`) VALUES (";
    	sql = sql + "'"+ pk_SchoolId +"','"+ password +"','"+ SchoolName +"','"+ PrincipalName +"','"+  SchoolAddress +"','"+ City +"','" + State +"','"+  Country +"','"+  Pincode +"','"+  Email +"','"+ Website +"','"+  ContactNo +"','"+  createdby +"','"+  lastupdateed +"','"+  status+"' )";
    			
    			

        jdbcTemplate.update(sql);

    }


}
