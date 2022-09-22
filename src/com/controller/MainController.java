package com.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.validation.FormValidation;

@Controller
public class MainController {

	@RequestMapping(value = "login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "loginController",method = RequestMethod.POST)
	public ModelAndView loginController(@RequestParam String email,
			@RequestParam String password) throws ClassNotFoundException,
			SQLException {
		ModelAndView mav = new ModelAndView();
		FormValidation fv = new FormValidation();
		String error = fv.checkEmail(email);
		if (!("success".equals(error))) {
			mav.addObject("error", error);
			mav.setViewName("login");
			return mav;
		}
		error = fv.checkPass(password);
		if (!("success".equals(error))) {
			mav.addObject("error", error);
			mav.setViewName("login");
			return mav;
		}
		if ("success".equals(error)) {
			com.dao.CheckLogin cl = new com.dao.CheckLogin();
			System.out.println(cl.hasUser(email, password));
			mav.setViewName("home");
		}
		return mav;
	}

}
