package com.hcs.designpatterns.structural.decorator.example6;

import java.util.ArrayList;


public class SimpleEmail implements Email {

	private String user;
	private String subject;
	private String message;
	private ArrayList<String> recipients;
	
	public SimpleEmail(String user, String subject, String message, String ... recipients) {
		this.user = user;
		this.subject = subject;
		this.message = message;
		this.recipients = new ArrayList<String>();
		for (String recipient : recipients) {
			if (!this.recipients.contains(recipient))
				this.recipients.add(recipient);
		}
	}
	
	@Override
	public String getUser() {
		return user;
	}

	@Override
	public String getSubject() {
		return subject;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public ArrayList<String> getRecipients() {
		return recipients;
	}
	
	@Override
	public void sendEmail() {
		System.out.println("Sending e-mail... The mail has been sent successfully.");
	}
		
}
