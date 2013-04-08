package com.hcs.designpatterns.behavioral.observer.example2;

public interface Subject {

	public void registerObserver(Observer obs);
	public void unregisterObserver(Observer obs);
	public void notifyObservers();
	
}
