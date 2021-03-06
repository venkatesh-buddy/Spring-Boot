package com.kafka.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "test";
	
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	public void sendMessage(String message) {
		logger.info("Kafka producer::"+message);
		this.kafkaTemplate.send(TOPIC, message);
	}
			
			

}
