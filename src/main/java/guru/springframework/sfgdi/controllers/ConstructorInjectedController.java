package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Service;

import guru.springframework.sfgdi.services.GreetingService;

@Service
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
