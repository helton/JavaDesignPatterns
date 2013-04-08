package com.hcs.designpatterns.structural.decorator.example5;

//The abstract Coffee class defines the functionality of Coffee implemented by decorator
public abstract class Coffee {
	
	public abstract double getCost(); // returns the cost of the coffee
	public abstract String getIngredients(); // returns the ingredients of the coffee
	
}
