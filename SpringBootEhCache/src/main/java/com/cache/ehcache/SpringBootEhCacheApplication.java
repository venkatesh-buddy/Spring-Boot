package com.cache.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//enables the cache management capability  
@EnableCaching
public class SpringBootEhCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEhCacheApplication.class, args);
	}

}
