package com.hcs.designpatterns.creational.builder.example4;

public class OperatingSystemDemo {

	public static void main(String[] args) {
		OperatingSystemDirector director;
		
		director = new OperatingSystemDirector(new LinuxOperatingSystemBuilder());
		director.build();
		System.out.println(director.getOperatingSystem());
		
		director = new OperatingSystemDirector(new WindowsOperatingSystemBuilder());
		director.build();
		System.out.println(director.getOperatingSystem());		
	}
	
}
