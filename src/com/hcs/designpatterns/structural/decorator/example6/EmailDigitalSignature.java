package com.hcs.designpatterns.structural.decorator.example6;

public class EmailDigitalSignature extends EmailDecorator {

	private String digitalSignature;

	public EmailDigitalSignature(Email wrappedEmail, String digitalSignature) {
		super(wrappedEmail);
		this.digitalSignature = digitalSignature;
	}

	@Override
	public String getMessage() {
		return super.getMessage() + "\n" + digitalSignature;
	}
	
}
