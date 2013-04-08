package com.hcs.designpatterns.behavioral.observer.example2;

public class Main {

	private static StockMarket stockMarket = new StockMarket();
	private static Store appleStore = new Store("Apple Store", "i", 1.3);
	private static Store googleStore = new Store("Google Store", "Google ", .45);
	private static Store chingLingStore = new Store("ChingLing Store", "cl", -.2);
	
	public static void main(String[] args) {
		stockMarket.registerObserver(appleStore);
		stockMarket.registerObserver(googleStore);
		stockMarket.registerObserver(chingLingStore);
		Gadget phone  = new Gadget("Phone",  "Phone - maybe it do something useful.", 1000.44);
		Gadget pad    = new Gadget("Pad",    "Pad is so expensive!",                  1400.99);
		Gadget reader = new Gadget("Reader", "Reader is cheap, buy it!",               500.56);
		stockMarket.addGadgetToStores(phone);
		printStoresInfo();
		stockMarket.addGadgetToStores(pad);
		stockMarket.addGadgetToStores(reader);
		printStoresInfo();
		stockMarket.updateGadgetPrice(phone, 1245.99);
		printStoresInfo();
		stockMarket.removeGadgetFromStores(pad);
		printStoresInfo();
		stockMarket.updateGadgetDescription(reader, "New description for gadget "+reader.getName());
		printStoresInfo();
		stockMarket.unregisterObserver(appleStore);
		stockMarket.removeGadgetFromStores(reader);
		printStoresInfo();
	}
	
	public static void printStoresInfo() {
		//stockMarket.printGadgetsList();
		appleStore.printGadgetsList();
		appleStore.printProfit();
		googleStore.printGadgetsList();
		googleStore.printProfit();
		chingLingStore.printGadgetsList();
		chingLingStore.printProfit();		
	}
	
}