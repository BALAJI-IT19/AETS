package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Booking;
import com.bean.Employee;
import com.dao.BookingQueue;

@Controller
public class MainController {

	@RequestMapping(value = "welcome-layout")
	public String welcome() {
		return "welcome-layout";
	}

	@RequestMapping(value = "my-rides")
	public ModelAndView myRides(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		BookingQueue bqObj = new BookingQueue();
		HttpSession session = request.getSession();
		Employee emp = (Employee) session.getAttribute("emp");
		ArrayList<Booking> ridesList = bqObj.rides(emp.getEmpId());
		mv.addObject("ridesList",ridesList);
		for(Booking ride:ridesList){
			System.out.println(ride.getStart());
		}
		mv.setViewName("my-rides-layout");
		return mv;
	}

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
