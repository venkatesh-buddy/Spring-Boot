package com.kafka.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
	private static final String TOPIC = "test";	
	
	@KafkaListener(topics=TOPIC, groupId = "group-id")
	public void getMessage(String message) {
		logger.info("Kafka consumer::"+message);
	}
	

}
