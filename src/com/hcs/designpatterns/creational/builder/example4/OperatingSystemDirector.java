package com.hcs.designpatterns.creational.builder.example4;

public class OperatingSystemDirector {

	private OperatingSystemBuilder builder;
	
	public OperatingSystemDirector(OperatingSystemBuilder builder) {
		this.builder = builder;
	}
	
	public void build() {
		builder.buildName();
		builder.buildCreator();
		builder.buildLastStableVersion();
		builder.buildLogo();
		builder.buildStatistics();
	}
	
	public OperatingSystem getOperatingSystem() {
		return builder.getOperatingSystem();
	}
	
}
