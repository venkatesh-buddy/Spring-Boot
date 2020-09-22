package com.design.patterns.creational.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {
	
	
	@GetMapping("/singleton")
	public String getSingleton() throws CloneNotSupportedException {
		Singleton s = Singleton.getInstance();
		//s.clone(); // will throw CloneNotSupportedException
		return null;
		
	}

}
