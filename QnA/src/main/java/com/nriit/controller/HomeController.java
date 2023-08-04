package com.nriit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nriit.db.DBConnection;
import com.nriit.repository.UserRepository;
import com.nriit.to.User;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/getRegistrationPage")
	public String registrationPage( ) {
		
		return "registration_page";
	}
	
//	@PostMapping("/registerMe")
//	public String register(String uname, String password, String name, String email)  {
//		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		userRepository.saveUser(uname, password, name, email);
//		
//		return "index";
//	}
	
//	@PostMapping("/registerMe")
//	public String register(String uname, String password, String name, String email)  {
//		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		User user = new User(uname, password, name, email);
//		
//		userRepository.saveUser(user);
//		
//		return "index";
//	}
	
	@PostMapping("/registerMe")
	public String register(String uname, String password, String name, String email)  {
		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email);
		
		User user = new User(uname, password, name, email);
		
		userRepository.saveUser(user);
		
		return "index";
	}
	
	
	
	
	
	
}
