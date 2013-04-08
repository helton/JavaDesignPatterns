package com.hcs.designpatterns.structural.decorator.example6;

import java.util.ArrayList;

public interface Email {

	public String getUser();
	public String getSubject();
	public String getMessage();
	public ArrayList<String> getRecipients();
	public void sendEmail();
	
}
