package com.spring.profile.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.profile.configuarion.BasicConfiguration;

@RestController
public class BasicProfileController {
	
	@Autowired
	private BasicConfiguration basicConfiguration;
	
	@Value("${connection.url}")
	private String connectionUrl;
	
	@GetMapping("/profile")
	public String getActiveProfile() {
		return connectionUrl;
	}
	
	@GetMapping("/dynamicConfigProps")
	public Map<String, String> getDynamicConfigProps(){
		Map<String, String> map = new HashMap<>();
		map.put("Name", basicConfiguration.getName());
		map.put("Age", basicConfiguration.getAge().toString());
		return map;
		
	}

	
	
	

}
