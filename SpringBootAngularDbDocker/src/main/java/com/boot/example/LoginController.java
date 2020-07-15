package com.boot.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class LoginController {
	
	@PostMapping(path="/login")	
	public AuthenticateBean doLogin() {
		return new AuthenticateBean("success");
	}

}
