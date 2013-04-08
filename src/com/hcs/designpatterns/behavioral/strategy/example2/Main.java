package com.hcs.designpatterns.behavioral.strategy.example2;

public class Main {
	
	public static void  main(String[] args) {
		SortableArray array = new SortableArray();
		int arraySize = 50000;
		
		System.out.println("\nInitializing new array\n");
		array.initialize(arraySize);		
		//array.print();						
		array.setSortAlgorithm(new BubbleSort());
		array.sort();
		System.out.println("\nOrdered array (with BubbleSort)\n");
		//array.print();		
		
		System.out.println("\nInitializing new array\n");
		array.initialize(arraySize);		
		//array.print();						
		array.setSortAlgorithm(new SelectionSort());
		array.sort();
		System.out.println("\nOrdered array (with SelectionSort)\n");
		//array.print();
		
		System.out.println("\nInitializing new array\n");
		array.initialize(arraySize);		
		//array.print();						
		array.setSortAlgorithm(new QuickSort());
		array.sort();
		System.out.println("\nOrdered array (with QuickSort)\n");
		//array.print();
	}
}
