package com.hcs.designpatterns.creational.abstractFactory.example2;

public class LinuxWindow extends Window {

	public LinuxWindow() {
		super("Ubuntu Default Window");
	}

	public LinuxWindow(String title) {
		super(title);
	}	
	
	@Override
	public void repaint() {
		
	}
	
}
