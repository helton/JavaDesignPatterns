package com.hcs.designpatterns.structural.decorator.example5;

//abstract decorator class - note that it extends Coffee abstract class
public abstract class CoffeeDecorator extends Coffee {
	
	protected final Coffee decoratedCoffee;
	protected String ingredientSeparator = ", ";

	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}

	public double getCost() { // implementing methods of the abstract class
		return decoratedCoffee.getCost();
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
	
}