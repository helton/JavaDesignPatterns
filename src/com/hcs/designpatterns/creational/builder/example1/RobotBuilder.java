package com.hcs.designpatterns.creational.builder.example1;

public interface RobotBuilder {

	public void buildRobotHead();
	public void buildRobotTorso();
	public void buildRobotArms();
	public void buildRobotLegs();
	public Robot getRobot();
	
}
