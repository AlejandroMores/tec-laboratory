package com.labtec.lab.greeting.service;

import com.labtec.lab.greeting.model.Greeting;
import com.labtec.lab.greeting.repository.GreetingRepositoryImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Autowired
	private GreetingRepositoryImlp greetingRepositoryImlp;

	@Override
	public Greeting getGreeting() {
		return greetingRepositoryImlp.getGreeting();
	}
}
