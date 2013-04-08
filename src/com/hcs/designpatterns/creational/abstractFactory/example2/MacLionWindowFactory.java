package com.hcs.designpatterns.creational.abstractFactory.example2;

public class MacLionWindowFactory implements WindowFactory {

	@Override
	public Window getWindow() {
		return new MacLionWindow();
	}

	@Override
	public Window getWindow(String title) {
		return new MacLionWindow(title);
	}

}
