package com.labtec.lab.greeting.controller;

import com.labtec.lab.greeting.model.Greeting;
import com.labtec.lab.greeting.service.GreetingService;
import com.labtec.lab.greeting.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingServiceImpl greetingServiceImpl;

	@GetMapping(value = "/v1/user")
	Greeting getGreeting() {
		return greetingServiceImpl.getGreeting();
	}
}
