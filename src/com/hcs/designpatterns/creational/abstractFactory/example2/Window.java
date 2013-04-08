package com.hcs.designpatterns.creational.abstractFactory.example2;

import java.awt.Dimension;

public abstract class Window {
	
	protected String title;
	protected Dimension dimension;	
	
	protected Window() {
		this("Default Window");
	}
	
	protected Window(String title) {
		//Setup platform independent properties
		this.title = title;
	}
	
	public String getOperatingSystem() {
		return System.getProperty("os.name");
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getWidth() {
		return dimension.width;
	}
	
	public int getHeight() {
		return dimension.height;
	}	
	
	public void setDimension(int width, int height) {
		dimension.setSize(width, height);
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension.setSize(dimension);
	}		
		
	public abstract void repaint();
	
}
