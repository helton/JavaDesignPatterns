package com.hcs.designpatterns.creational.builder.example4;

public class WindowsOperatingSystemBuilder implements OperatingSystemBuilder {
	
	private OperatingSystem operatingSystem;
	
	public WindowsOperatingSystemBuilder() {
		operatingSystem = new OperatingSystem();
	}
	
	@Override
	public void buildName() {
		operatingSystem.setName("Windows");
	}

	@Override
	public void buildCreator() {
		operatingSystem.setCreator("Bill Gates and Paul Allen");
	}

	@Override
	public void buildLogo() {
		operatingSystem.setLogo("Window");		
	}

	@Override
	public void buildLastStableVersion() {
		operatingSystem.setLastStableVersion("Windows 8");		
	}

	@Override
	public void buildStatistics() {
		operatingSystem.setStatistics(55.53);		
	}

	@Override
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

}
