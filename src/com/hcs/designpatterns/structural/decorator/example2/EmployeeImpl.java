package com.hcs.designpatterns.structural.decorator.example2;

import java.util.Date;

public class EmployeeImpl implements Employee {
	
	private String name;
	
	public EmployeeImpl(String name) {
		this.name = name;
	}

	// other behaviors and properties may reside (see sample code)
	public void join(Date joinDate){
		System.out.println(this.getName() + " joined on " + joinDate);
	}

	public void terminate(Date terminateDate){
		System.out.println(this.getName() + " terminate on " + terminateDate);
	}

	@Override
	public String getName() {
		return name;
	}
}