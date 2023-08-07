package com.nriit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nriit.repository.QuesAndAnswerRepository;
import com.nriit.to.QuesAndAns;

@Controller
public class QuesNAnswerController {

	@Autowired
	QuesAndAnswerRepository bookRepository;

	@GetMapping("/deleteQnA/{questionId}")
	public ModelAndView delete(@PathVariable String questionId) {

		System.out.println("The Question Id is: " + questionId);

		bookRepository.delete(questionId);

		List<QuesAndAns> quesAndAns = bookRepository.getBooks();

		ModelAndView modelAndView = new ModelAndView("admin_welcome");

		modelAndView.addObject("quesAndAns", quesAndAns);

		return modelAndView;
	}

	@GetMapping("/updatePage/{questionId}")
	public ModelAndView updatePage(@PathVariable String questionId) {

		System.out.println("Thge Question Id of update is " + questionId);

		QuesAndAns quesAndAns = bookRepository.get(questionId);

		ModelAndView modelAndView = new ModelAndView("update_qna");

		modelAndView.addObject("quesAndAns", quesAndAns);

		return modelAndView;
	}

	@PostMapping("/update")
	public ModelAndView update(String questionId, String question, String answer, String category) {

		System.out.println(questionId + ", " + question + ", " + answer + "," + category);
		
		bookRepository.update(questionId, question, answer, category);

		List<QuesAndAns> quesAndAns = bookRepository.getBooks();

		ModelAndView modelAndView = new ModelAndView("admin_welcome");

		modelAndView.addObject("quesAndAns", quesAndAns);
		
		return modelAndView;
	}

}
