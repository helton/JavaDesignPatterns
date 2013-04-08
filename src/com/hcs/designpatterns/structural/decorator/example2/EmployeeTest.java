package com.hcs.designpatterns.structural.decorator.example2;

import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new EmployeeImpl("John Fox");
		employee.join(new Date());
		
		employee = new TeamMember(employee);
		((TeamMember)employee).coordinateWithOthers();
		((TeamMember)employee).performTask();
		
		employee = new TeamLead(employee);
		((TeamLead)employee).motivate();
		((TeamLead)employee).planning();
		
		employee = new Manager(employee);		
		((Manager)employee).assignTask();
		((Manager)employee).profileEmployee();
		((Manager)employee).createRequirements();
		
		employee.terminate(new Date());		
		
	}
	
}
