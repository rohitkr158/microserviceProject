package com.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	//doing dependency injection for feign client
	@Autowired
	private Client client;
	
	@GetMapping("/fromsecondcontroller")	
	public String getMessageFromMicroservice1() {
		return client.getData();
	}
}
