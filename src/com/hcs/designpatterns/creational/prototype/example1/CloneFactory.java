package com.hcs.designpatterns.creational.prototype.example1;

public class CloneFactory {
	
	public Animal getClone(Animal animalSample) {
		return animalSample.makeCopy();
	}

}
