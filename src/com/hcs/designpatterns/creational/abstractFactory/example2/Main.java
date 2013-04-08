package com.hcs.designpatterns.creational.abstractFactory.example2;

public class Main {

	public static void main(String[] args) {
		
		WindowFactory windowFactory = new WindowFactoryBuilder().getWindowFactory();
		
		if (windowFactory != null) {
			Window window = windowFactory.getWindow("My window title!");
			System.out.println("Running in the operating system: " + window.getOperatingSystem());			
			System.out.println(window.getTitle());
		}
		else
			System.out.println("Unrecognized operating system. None window will be displayed :(");
		
	}
	
}
