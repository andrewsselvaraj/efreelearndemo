package com.efreelearn.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	  @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Hello CPntorler!";
    }
    @RequestMapping("/ap")
    public  ArrayList<String> addtionalPath() {
    	ArrayList<String> al = new ArrayList<String>();
    	al.add("arg0");al.add("arg1");
        return al;
    }
    @RequestMapping("/getAllEmployeeDetails")
    public  ArrayList<String> getAllEmployeeDetails() {
    	ArrayList<String> al = new ArrayList<String>();
    	al.add("arg0");al.add("arg1");
        return al;
    }
    
}
