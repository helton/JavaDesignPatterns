package com.hcs.designpatterns.creational.prototype.example1;

public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog created!");
	}
	
	//public Animal makeCopy() {
	public Dog makeCopy() {		
		System.out.println("Copying dog...");
		Dog clonedDog = null;
		try {
			clonedDog = (Dog)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedDog;		
	}
	
	public String toString() {
		return "toString of Dog class called!";
	}
}
