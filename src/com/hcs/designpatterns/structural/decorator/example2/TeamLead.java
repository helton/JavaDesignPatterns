package com.hcs.designpatterns.structural.decorator.example2;

public class TeamLead extends EmployeeDecorator {

	protected TeamLead(Employee employee) {
		super(employee);
	}

	public void planning() {
		System.out.println("[Team Lead] " + this.employee.getName() + " is planning.");
	}

	public void motivate() {
		System.out.println("[Team Lead] " + this.employee.getName() + " is motivating his members.");
	}
	
}