package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.dao.EmpDetails;
import com.utility.Encryption;

@Controller
public class RegisterController {

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register() {
		return "register";
	}

	@RequestMapping(value = "register-controller", method = RequestMethod.POST)
	public ModelAndView registerController(Employee emp) {
		Encryption encrypt = new Encryption();
		ModelAndView mav = new ModelAndView();
		emp.setPassword(encrypt.encryptOrDecrypt(emp.getPassword()));
		EmpDetails post = new EmpDetails();
		String msg = post.post(emp);
		if ("success".equals(msg))
			mav.setViewName("login");
		else {
			mav.addObject("error", msg);
			mav.setViewName("register");
		}
		return mav;
	}

}
