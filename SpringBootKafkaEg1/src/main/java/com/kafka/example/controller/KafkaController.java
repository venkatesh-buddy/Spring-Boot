package com.kafka.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.example.service.Producer;

@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	@GetMapping("/producer/{message}")
	public void getMessage(@PathVariable String message) {
		producer.sendMessage(message);
	}
	

}
