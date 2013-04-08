package com.hcs.designpatterns.creational.prototype.example1;

public class TestingCloning {

	public static void main(String[] args) {
		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		//Sheep clonedSheep = (Sheep)animalMaker.getClone(sally);
		Sheep clonedSheep = sally.makeCopy();
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally hashCode = " + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("Cloned sheep hashCode = " + System.identityHashCode(System.identityHashCode(clonedSheep)));
		
		Dog max = new Dog();
		Dog clonedDog = (Dog)animalMaker.getClone(max);
		System.out.println(max);
		System.out.println(clonedDog);
		System.out.println("Max hashCode = " + System.identityHashCode(System.identityHashCode(max)));
		System.out.println("Cloned dog hashCode = " + System.identityHashCode(System.identityHashCode(clonedDog)));		
	}
}
