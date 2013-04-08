package com.hcs.designpatterns.behavioral.observer.example2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Store implements Observer {

	private ArrayList<Gadget> gadgets;
	private String storeName;
	private String storeGadgetPreffix;
	private double profitRate;
	private DecimalFormat df = new DecimalFormat("$#,###.00");

	public Store(String storeName, String storeGadgetPreffix, double profitRate) {
		this.storeName = storeName;
		this.storeGadgetPreffix = storeGadgetPreffix;
		this.profitRate = profitRate;
		gadgets = new ArrayList<Gadget>();
	}
	
	@Override
	public void update(Gadget gadget, Status status) {
		Gadget currentGadget = new Gadget(storeGadgetPreffix+gadget.getName(), gadget.getDescription().replace(gadget.getName(), storeGadgetPreffix+gadget.getName()), gadget.getPrice() * (1+profitRate));
		System.out.println("***********************************************");
		switch (status) {
			case insert: 	
				System.out.println("["+storeName+" News]\nNew gadget " +currentGadget.getName() + " available on "+storeName+"!");
				gadgets.add(currentGadget);
				break;
			case delete:
				System.out.println("["+storeName+" News]\nGadget " +currentGadget.getName() + " is no more available on "+storeName+".");
				gadgets.remove(getGadgetByName(gadget.getName()));
				break;
			case update:
				System.out.println("["+storeName+" News]\nInfo of gadget " +currentGadget.getName() + " updated on "+storeName+"! Check it!");				
				gadgets.set(gadgets.indexOf(getGadgetByName(gadget.getName())), currentGadget);
				break;				
		}
		System.out.println("***********************************************\n");
	}	
	
	public Gadget getGadgetByName(String name) {
		for (Gadget gadget : gadgets) {
			if (gadget.getName().equals(storeGadgetPreffix+name))
				return gadget;
		}
		return null;
	}
	
	public void printGadgetsList() {
		System.out.println("======================================");		
		System.out.println(storeName);
		System.out.println("======================================");
		for (Gadget gadget : gadgets)
			System.out.println(gadget.toString());
	}	
		
	public void printProfit() {
		double totalProfit = 0;
		for (Gadget gadget : gadgets)
			totalProfit += gadget.getPrice() * profitRate / (profitRate + 1);	
		System.out.println("=======================================================");		
		System.out.println("Total profit ["+storeName+"] = " + df.format(totalProfit));
		System.out.println("=======================================================\n");						
	}
}