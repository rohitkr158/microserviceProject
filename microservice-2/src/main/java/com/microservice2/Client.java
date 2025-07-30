package com.microservice2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MICROSERVICE-1")
public interface Client {
	//create a abstract method and call MS-1 method using @GetMapping("/message") and this invoking will happen using feign client
	@GetMapping("/message")
	public String getData();
}
