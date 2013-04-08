package com.hcs.designpatterns.creational.prototype.example2;

public class Job implements CloneableObject {
	
	private String name;
	private String department;
	
	public Job(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Job name = " + name + "\n" +
				"Department = " + department;
	}

	@Override
	public Job getClone() {
		try {
			return (Job)super.clone();			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
