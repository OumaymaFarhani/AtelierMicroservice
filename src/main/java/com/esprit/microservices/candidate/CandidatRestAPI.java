package com.esprit.microservices.candidate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestAPI {
	
	private String title="Hello, I'm the candidate Microservice";
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}

}
