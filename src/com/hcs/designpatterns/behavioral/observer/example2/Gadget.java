package com.hcs.designpatterns.behavioral.observer.example2;

import java.text.DecimalFormat;

public class Gadget {

	private String name;
	private String description;	
	private double price;
	private DecimalFormat df = new DecimalFormat("$#,###.00");
	
	public Gadget(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return	"Name: " + getName() + "\n" + 
				"Description: " + getDescription() + "\n" +
				"Price: " + df.format(getPrice()) + "\n";
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}	

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
