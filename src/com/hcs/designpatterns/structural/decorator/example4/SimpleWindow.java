package com.hcs.designpatterns.structural.decorator.example4;

//extension of a simple Window without any scrollbars
public class SimpleWindow extends Window {
	
	public void draw() {
		System.out.println("Drawing a simple window...");
	}

	public String getDescription() {
		return "simple window";
	}
	
}