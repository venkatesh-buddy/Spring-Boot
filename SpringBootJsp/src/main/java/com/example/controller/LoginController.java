package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String showLogin() {
		System.out.println("login page***********");
		return "login";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String showLandingPage() {
		return "landing";
	}

}
