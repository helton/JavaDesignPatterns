package com.hcs.designpatterns.structural.decorator.example2;

import java.util.Date;

public abstract class EmployeeDecorator implements Employee {

	protected Employee employee;

	protected EmployeeDecorator(Employee employee) {
		this.employee = employee;
	}

	public void join(Date joinDate) {
		employee.join(joinDate);
	}

	public void terminate(Date terminateDate) {
		employee.terminate(terminateDate);
	}
	
	public String getName() {
		return employee.getName();
	}
}