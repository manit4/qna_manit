package com.nriit.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nriit.repository.BookRepository;
import com.nriit.repository.UserRepository;
import com.nriit.to.QuesAndAns;
import com.nriit.to.User;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
//	@PostMapping("/login")
//	public String login(String username, String password) throws SQLException {
//		
//		System.out.println("inside login()..."+username+", "+password);
//		
//		User user = userRepository.findUser(username, password);
//		
//		if(user != null) {
//			
//			if(user.getRole().equals("admin")) {
//				return "admin_welcome";
//			}
//			else {
//				return "student_welcome";
//			}
//		}
//		else {
//			return "index";
//		}
//	}

	@PostMapping("/login")
	public ModelAndView login(String username, String password) throws SQLException {
		
		System.out.println("inside login()..."+username+", "+password);
		
		ModelAndView modelAndView = null;
		
		User user = userRepository.findUser(username, password);
		
		if(user != null) {
			
			BookRepository  bookRepository = new BookRepository();
			List<QuesAndAns>  quesAndAns = bookRepository.getBooks();
			
			if(user.getRole().equals("admin")) {
				modelAndView = new ModelAndView("admin_welcome");
				modelAndView.addObject("userData", user);
				modelAndView.addObject("quesAndAns", quesAndAns);
				return modelAndView;
			}
			else {
				modelAndView = new ModelAndView("student_welcome");
				modelAndView.addObject("userData", user);
				modelAndView.addObject("quesAndAns", quesAndAns);
				return modelAndView;
			}
		}
		else {
			modelAndView = new ModelAndView("index");
			return modelAndView;
		}
	}
	
	
}
