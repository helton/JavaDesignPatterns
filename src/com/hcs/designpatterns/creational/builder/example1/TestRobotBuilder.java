package com.hcs.designpatterns.creational.builder.example1;

public class TestRobotBuilder {

	private static RobotBuilder oldStyleRobot;
	private static RobotEngineer robotEngineer;
	
	public static void main(String[] args) {
		 oldStyleRobot = new OldRobotBuilder();
		 robotEngineer = new RobotEngineer(oldStyleRobot);
		 robotEngineer.makeRobot();
		 Robot firstRobot = robotEngineer.getRobot();
		 System.out.println("Robot Built");
		 System.out.println("Robot Head Type: "+firstRobot.getRobotHead());
		 System.out.println("Robot Torso Type: "+firstRobot.getRobotTorso());
		 System.out.println("Robot Arm Type: "+firstRobot.getRobotArms());
		 System.out.println("Robot Leg Type: "+firstRobot.getRobotLegs());		 
	}
	
}
