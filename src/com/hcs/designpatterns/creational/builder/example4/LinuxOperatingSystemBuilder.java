package com.hcs.designpatterns.creational.builder.example4;

public class LinuxOperatingSystemBuilder implements OperatingSystemBuilder {

	private OperatingSystem operatingSystem;
	
	public LinuxOperatingSystemBuilder() {
		operatingSystem = new OperatingSystem();
	}
	
	@Override
	public void buildName() {
		operatingSystem.setName("Linux");
	}

	@Override
	public void buildCreator() {
		operatingSystem.setCreator("Linus Torvalds");
	}

	@Override
	public void buildLogo() {
		operatingSystem.setLogo("Tux");		
	}

	@Override
	public void buildLastStableVersion() {
		operatingSystem.setLastStableVersion("Linux Kernel: 3.8.4 (March 20, 2013)");		
	}

	@Override
	public void buildStatistics() {
		operatingSystem.setStatistics(1.42);		
	}

	@Override
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

}
