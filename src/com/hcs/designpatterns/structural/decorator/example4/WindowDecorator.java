package com.hcs.designpatterns.structural.decorator.example4;

//abstract decorator class - note that it extends Window
public abstract class WindowDecorator extends Window {

	protected Window decoratedWindow; // the Window being decorated

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}

	public void draw() {
		decoratedWindow.draw(); // delegation
	}

	public String getDescription() {
		return decoratedWindow.getDescription(); // delegation
	}
	
}