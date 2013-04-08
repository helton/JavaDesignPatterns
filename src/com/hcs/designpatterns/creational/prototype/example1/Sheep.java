package com.hcs.designpatterns.creational.prototype.example1;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Shepp created!");
	}
	
	//public Animal makeCopy() {
	public Sheep makeCopy() {		
		System.out.println("Cloning sheep...");
		
		//Animal sheepObject = null;
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheepObject;
	}
	
	public String toString() {
		return "toString of Sheep class called!";
	}
	
}
