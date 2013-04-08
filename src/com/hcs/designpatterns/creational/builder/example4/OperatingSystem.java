package com.hcs.designpatterns.creational.builder.example4;

public class OperatingSystem {
	
	private String name;
	private String creator;
	private String logo;
	private String lastStableVersion;
	private double statistics;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLastStableVersion() {
		return lastStableVersion;
	}

	public void setLastStableVersion(String lastStableVersion) {
		this.lastStableVersion = lastStableVersion;
	}

	public double getStatistics() {
		return statistics;
	}

	public void setStatistics(double statistics) {
		this.statistics = statistics;
	}
	
	@Override
	public String toString() {
		return "Name...............: " + name + "\n" +
				"Creator(s).........: " + creator + "\n" +
				"Logo...............: " + logo + "\n" +
				"Last stable version: " + lastStableVersion + "\n" +
				"Statistics.........: " + statistics + "%\n";
	}

}
