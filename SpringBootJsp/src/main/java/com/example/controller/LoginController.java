package com.example.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.User;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@RequestMapping(value= {"", "/login"})
	public String showLogin() {
		System.out.println("login page***********");
		return "login";
	}
	
	
	 @ModelAttribute("user")
	 public User setUpUserForm() {
		 return new User();
	}
	
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String showLandingPage(@ModelAttribute("user") User user) {
		user.setLoginDateTime(user.loginDate());
		return "redirect:/dashboard";
	}

}
