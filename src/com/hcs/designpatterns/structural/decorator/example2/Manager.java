package com.hcs.designpatterns.structural.decorator.example2;

public class Manager extends EmployeeDecorator {

	protected Manager(Employee employee) {
		super(employee);
	}

	public void assignTask() {
		System.out.println("[Manager] " + this.employee.getName() + " is assigning tasks.");
}

	public void profileEmployee() {
		System.out.println("[Manager] " + this.employee.getName() + " is profiling employees.");
}

	public void createRequirements() {
		System.out.println("[Manager] " + this.employee.getName() + " is creating requirement documents.");
	}
	
}