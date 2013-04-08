package com.hcs.designpatterns.creational.abstractFactory.example2;

public class Win7Window extends Window {

	public Win7Window() {
		super("Windows 7 Default Window");
	}

	public Win7Window(String title) {
		super(title);
	}	
	
	@Override
	public void repaint() {
		
	}

}
