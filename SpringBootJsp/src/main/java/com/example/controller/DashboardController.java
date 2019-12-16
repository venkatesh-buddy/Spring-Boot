package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.model.User;

@Controller
public class DashboardController {
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String showLandingPage(@SessionAttribute("user") User user, ModelMap model) {
		model.put("user", user);
		System.out.println("User:::"+user);
		return "landing";
	}
	
}
