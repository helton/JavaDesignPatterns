package com.hcs.designpatterns.structural.decorator.example6;

public class EmailTest {
	
	public static void printEmailInfo(Email email) {
		System.out.println("=======================================");		
		System.out.println("From...: " + email.getUser());
		System.out.println("To.....: " + email.getRecipients());
		System.out.println("Subject: " + email.getSubject());
		System.out.println("Message: \n" + email.getMessage());
		System.out.println("=======================================");			
	}

	public static void main(String[] args) {
		Email email = new SimpleEmail("helton@gmail.com", "My Subject", 
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n"+
				"tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n"+
				"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n"+
				"consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n"+
				"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n"+
				"proident, sunt in culpa qui officia deserunt mollit anim id est laborum", 
				"helton@hotmail.com", "john@hotmail.com", "peter@hotmail.com", "mary@hotmail.com");		
		printEmailInfo(email);
		
		email = new EmailDigitalSignature(email, "\nAtt,\nHelton\nSoftware Developer\n(99)9999-9999");
		printEmailInfo(email);
		
		email = new EmailGreeting(email, "Hey, people!\n");
		printEmailInfo(email);		
		
		email = new EmailUpperCase(email);
		printEmailInfo(email);			
		
		email.sendEmail();		
	}
	
}
