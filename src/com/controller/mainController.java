package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.BookingQueue;

@Controller
public class mainController {

	
	@RequestMapping(value = "welcomeController")
	public ModelAndView welcomeController(HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView();
		BookingQueue bqObj= new BookingQueue();
		if(bqObj.addingToQueue()) {
			mv.setViewName("welcome");
			mv.addObject("error", "success");
			System.out.println("here inside welocme");
		}
		else {
			mv.setViewName("login");
		}
		
		return mv;
	}
}
