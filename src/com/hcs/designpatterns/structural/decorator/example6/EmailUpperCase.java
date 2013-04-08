package com.hcs.designpatterns.structural.decorator.example6;

public class EmailUpperCase extends EmailDecorator {

	public EmailUpperCase(Email wrappedEmail) {
		super(wrappedEmail);
	}

	@Override
	public String getMessage() {
		return super.getMessage().toUpperCase();
	}
	
}
