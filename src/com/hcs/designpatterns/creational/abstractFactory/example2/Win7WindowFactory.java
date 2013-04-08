package com.hcs.designpatterns.creational.abstractFactory.example2;

public class Win7WindowFactory implements WindowFactory {

	@Override
	public Window getWindow() {
		return new Win7Window();
	}

	@Override
	public Window getWindow(String title) {
		return new Win7Window(title);
	}
	
}
