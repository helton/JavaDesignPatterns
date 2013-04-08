package com.hcs.designpatterns.structural.decorator.example6;

import java.util.ArrayList;

public abstract class EmailDecorator implements Email {

	private Email wrappedEmail;
	
	public EmailDecorator(Email wrappedEmail) {
		this.wrappedEmail = wrappedEmail;
	}
	
	@Override
	public String getUser() {
		return wrappedEmail.getUser();
	}

	@Override
	public String getSubject() {
		return wrappedEmail.getSubject();
	}

	@Override
	public String getMessage() {
		return wrappedEmail.getMessage();
	}

	@Override
	public ArrayList<String> getRecipients() {
		return wrappedEmail.getRecipients();
	}

	@Override
	public void sendEmail() {
		wrappedEmail.sendEmail();
	}
	
}
