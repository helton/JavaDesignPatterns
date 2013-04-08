package com.hcs.designpatterns.creational.abstractFactory.example2;

public class WindowFactoryBuilder {

	public WindowFactory getWindowFactory() {
		
		String operatingSystem = System.getProperty("os.name").toLowerCase();
		
		if (operatingSystem.contains("linux"))
			return new LinuxWindowFactory();
		else if (operatingSystem.contains("window"))
			return new Win7WindowFactory();
		else if (operatingSystem.contains("mac"))
			return new MacLionWindowFactory();
		
		return null;
	}
	
}
