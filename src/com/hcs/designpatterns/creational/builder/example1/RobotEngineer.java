package com.hcs.designpatterns.creational.builder.example1;

//Called Director
public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuidler) {
		this.robotBuilder = robotBuidler;
	}
	
	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		robotBuilder.buildRobotHead();
		robotBuilder.buildRobotTorso();
		robotBuilder.buildRobotArms();
		robotBuilder.buildRobotLegs();
	}
	
}
