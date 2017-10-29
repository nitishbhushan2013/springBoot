package com.nitish.teach.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration 
public class HomeController {
	
	public HomeController() {
		
	}

	@RequestMapping("/home")
	//@ResponseBody
	public String getInfo() {
		return "welcome to Spring Boot, Boys!!!!";
	}
}
