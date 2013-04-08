package com.hcs.designpatterns.structural.decorator.example4;

//the second concrete decorator which adds horizontal scrollbar functionality
public class HorizontalScrollBarDecorator extends WindowDecorator {
	
	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	private void drawHorizontalScrollBar() {
		System.out.println("Drawing the horizontal scrollbar...");
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
	
}