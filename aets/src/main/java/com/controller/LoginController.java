package com.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.dao.CheckLogin;
import com.dao.EmpDetails;
import com.utility.Encryption;
import com.validation.FormValidation;

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login-controller")
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
			com.dao.CheckLogin cl = new CheckLogin();
			com.utility.Encryption en = new Encryption();
			error = cl.hasUser(email, en.encryptOrDecrypt(password));
			if ("success".equalsIgnoreCase(error)) {
				mav.setViewName("welcome-layout");
				EmpDetails ed = new EmpDetails();
				Employee emp = ed.get(email);
				mav.addObject("emp", emp);
				return mav;
			} else {
				mav.addObject("error", error);
				mav.setViewName("login");
			}
		}
		return mav;
	}

}
