package com.hcs.designpatterns.structural.decorator.example3;

public class LivingAnimal implements Animal {

	@Override
	public void describe() {
		System.out.println("\nI am an animal.");
	}

}