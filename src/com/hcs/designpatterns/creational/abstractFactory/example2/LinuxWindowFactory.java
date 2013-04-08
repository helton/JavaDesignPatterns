package com.hcs.designpatterns.creational.abstractFactory.example2;

public class LinuxWindowFactory implements WindowFactory {

	@Override
	public Window getWindow() {
		return new LinuxWindow();
	}

	@Override
	public Window getWindow(String title) {
		return new LinuxWindow(title);
	}

}
