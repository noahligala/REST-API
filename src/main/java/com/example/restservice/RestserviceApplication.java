package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);

		
	}
		
		@GetMapping("/hello")
		public String hello(@RequestParam(value = "name", defaultValue = "Noah") String name) {
		return String.format("Hello %s!", name);
		}
	  
	}
  


