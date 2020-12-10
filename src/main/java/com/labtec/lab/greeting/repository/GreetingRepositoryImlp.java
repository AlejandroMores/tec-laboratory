package com.labtec.lab.greeting.repository;

import com.labtec.lab.greeting.model.Greeting;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImlp implements GreetingRepository {

	@Override
	public Greeting getGreeting() {
		return new Greeting(1L, "Alejandro Morales", "Hola Mundo!");
	}

}
