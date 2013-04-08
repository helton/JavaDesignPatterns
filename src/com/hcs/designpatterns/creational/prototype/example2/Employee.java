package com.hcs.designpatterns.creational.prototype.example2;

public class Employee implements CloneableObject {

	private String name;
	private String surname;
	private Job job;

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Employee(String fullname, String jobName, String departmentName) {
		this.name = fullname.split(" ")[0];
		this.surname = fullname.split(" ")[1];
		this.job = new Job(jobName, departmentName);		
	}

	@Override
	public Employee getClone() {
		Employee employee = null;
		try {			
			employee = (Employee)super.clone(); //only copy the fields and do a shadow copy of composite types (like objects)
			employee.job = job.getClone();      //it's needed copy it manually (it's a composite type) - Note: Job is a CloneableObject!
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public String toString() {
		return "Name = " + name + "\n" + 
				"Surname = " + surname + "\n" + 
				job;
	}

}
