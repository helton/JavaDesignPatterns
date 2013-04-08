package com.hcs.designpatterns.behavioral.observer.example2;

import java.util.ArrayList;

public class StockMarket implements Subject {
	
	private ArrayList<Observer> observers;
	private ArrayList<Gadget> gadgets;
	private Gadget currentGadget;
	private Status currentStatus;
	
	public StockMarket() {
		observers = new ArrayList<Observer>();
		gadgets   = new ArrayList<Gadget>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		if (!observers.contains(obs))
			observers.add(obs);
	}

	@Override
	public void unregisterObserver(Observer obs) {
		if (observers.contains(obs))
			observers.remove(obs);		
	}

	@Override	
	public void notifyObservers() {
		for (Observer observer : observers) 
			observer.update(currentGadget, currentStatus);
	}
	
	public void printGadgetsList() {
		System.out.println("======================================");		
		System.out.println("Base store [original gadgets prices]");
		System.out.println("======================================");		
		for (Gadget gadget : gadgets)
			System.out.println(gadget.toString());
	}
	
	public void addGadgetToStores(Gadget newGadget) {
		if (!gadgets.contains(newGadget)) {
			gadgets.add(newGadget);
			this.currentGadget = newGadget;
			this.currentStatus = Status.insert;
			notifyObservers();
		}
	}
		
	public void removeGadgetFromStores(Gadget gadget) {
		if (gadgets.contains(gadget)) {
			gadgets.remove(gadget);
			this.currentGadget = gadget;
			this.currentStatus = Status.delete;			
			notifyObservers();
		}
	}
	
	public void updateGadgetPrice(Gadget gadget, double newPrice) {
		if (gadgets.contains(gadget)) {
			gadget.setPrice(newPrice);
			this.currentGadget = gadget;
			this.currentStatus = Status.update;			
			notifyObservers();
		}
	}
		
	public void updateGadgetDescription(Gadget gadget, String newDescription) {
		if (gadgets.contains(gadget)) {
			gadget.setDescription(newDescription);
			this.currentGadget = gadget;
			this.currentStatus = Status.update;				
			notifyObservers();
		}
	}	
	
}
