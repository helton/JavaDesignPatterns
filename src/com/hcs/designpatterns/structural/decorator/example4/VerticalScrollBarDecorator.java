package com.hcs.designpatterns.structural.decorator.example4;

//the first concrete decorator which adds vertical scrollbar functionality
public class VerticalScrollBarDecorator extends WindowDecorator {
	
	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}

	private void drawVerticalScrollBar() {
		System.out.println("Drawing the vertical scrollbar...");
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
	
}