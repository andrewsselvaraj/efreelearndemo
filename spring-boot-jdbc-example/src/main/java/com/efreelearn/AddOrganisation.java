package com.efreelearn;

import static java.lang.System.exit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.efreelearn.dao.OrganisationRepository;
import com.efreelearn.dao.UserInfoRepository;
import com.efreelearn.model.UserInfo;

@SpringBootApplication
public class AddOrganisation implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    private OrganisationRepository organisationRepository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AddOrganisation.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + dataSource);

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                String id = ""+date.getTime();
                String pk_SchoolId = "11111";
                String password = "password";
                String SchoolName = "aac";
                String PrincipalName = "charles"; 
                String SchoolAddress = "a";
                String City = "city";
                String State = "state";
                String Country = "con";
                String Pincode = "625777";
                String Email = "andrew@yahoo.com";
                String Website = "aklsdlajs";
                String ContactNo = "9444104269	";
                String createdby = "83094823";
                String lastupdateed  = "098301";
                String status =  "A";
                organisationRepository.addOrganisation(   pk_SchoolId, password,    SchoolName,   PrincipalName,   SchoolAddress,   City,   State,  Country,  Pincode,  Email,  Website,   ContactNo,  createdby,   lastupdateed,  status);
           
      
    }
}