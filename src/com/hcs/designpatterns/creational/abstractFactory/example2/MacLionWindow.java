package com.hcs.designpatterns.creational.abstractFactory.example2;

public class MacLionWindow extends Window {

	public MacLionWindow() {
		super("MacLion Default Window");
	}

	public MacLionWindow(String title) {
		super(title);
	}	
	
	@Override
	public void repaint() {
		
	}
}
