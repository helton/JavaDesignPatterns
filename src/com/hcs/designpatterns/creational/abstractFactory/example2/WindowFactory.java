package com.hcs.designpatterns.creational.abstractFactory.example2;

public interface WindowFactory {
	
	public Window getWindow();
	public Window getWindow(String title);
	
}
