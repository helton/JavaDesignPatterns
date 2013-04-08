package com.hcs.designpatterns.structural.decorator.example2;

public class TeamMember extends EmployeeDecorator {

	protected TeamMember(Employee employee) {
		super(employee);
	}

	public void performTask() {
		System.out.println("[Team Member] " + employee.getName() + " is performing his assigned tasks.");
}

	public void coordinateWithOthers() {
		System.out.println("[Team Member] " + employee.getName() + " is coordinating with other members of his team.");
	}
	
}