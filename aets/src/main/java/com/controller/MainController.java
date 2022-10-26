package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Booking;
import com.dao.BookingQueue;

@Controller
public class MainController {

	@RequestMapping(value = "welcome-controller")
	public ModelAndView welcomeController(Booking bd) {

		ModelAndView mv = new ModelAndView();
		BookingQueue bqObj = new BookingQueue();
		mv.setViewName("welcome-layout");
		if (bqObj.addingToQueue(bd)) {
			mv.addObject("error", "success");
		} else {
			mv.addObject("error", "Queuing error");
		}
		return mv;
	}

	@RequestMapping(value = "forgot-password")
	public String forgot() {
		return "forgot-password";
	}

}
