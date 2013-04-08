package com.hcs.designpatterns.creational.builder.example4;

public interface OperatingSystemBuilder {
	
	public void buildName();
	public void buildCreator();
	public void buildLogo();
	public void buildLastStableVersion();
	public void buildStatistics();
	public OperatingSystem getOperatingSystem();
	
}
