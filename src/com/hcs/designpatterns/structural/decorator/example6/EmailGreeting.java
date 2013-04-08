package com.hcs.designpatterns.structural.decorator.example6;

public class EmailGreeting extends EmailDecorator {

	private String greeting;
	
	public EmailGreeting(Email wrappedEmail, String greeting) {
		super(wrappedEmail);
		this.greeting = greeting;		
	}

	@Override
	public String getMessage() {
		return greeting + "\n" + super.getMessage();
	}
	
}
