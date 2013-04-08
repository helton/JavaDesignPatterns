package com.hcs.designpatterns.structural.decorator.example1;

//Blueprint for classes that will have decorators
public interface Pizza {
	
	public String getDescription();
	
	public double getCost();
	
}