package com.hcs.designpatterns.behavioral.strategy.example2;

public class SortableArray {
	
	private int arraySize;
	private int[] array;	
	private SortAlgorithm sortAlgorithm;
		
	public void initialize(int arraySize) {
		this.arraySize = arraySize;
		array = new int[arraySize];
		for (int i = 0; i < arraySize; i++)
			array[i] = (int) Math.floor(Math.random()*arraySize);					
	}	
	
	public void print() {
		if (array != null) {
			for (int i = 0; i < arraySize; i++)
				System.out.println("["+i+"] = " + array[i]);
		}
	}
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void sort() {
		if ((array != null) && (sortAlgorithm != null)) {
			long startTime = System.currentTimeMillis();
			sortAlgorithm.sort(array);
			printElapsedTime(startTime);
		}
	}
	
	public void printElapsedTime(long startTime) {
		long elapsedTimeMillis = System.currentTimeMillis()-startTime;
		int elapsedTimeSec = (int) (elapsedTimeMillis/1000F);
		int elapsedTimeMin = (int) (elapsedTimeMillis/(60*1000F));
		int elapsedTimeHour = (int) (elapsedTimeMillis/(60*60*1000F));
		System.out.println("Time elapsed: "+elapsedTimeHour+"h"+elapsedTimeMin+"m"+elapsedTimeSec+"s"+elapsedTimeMillis+"ms");
	}
	
}