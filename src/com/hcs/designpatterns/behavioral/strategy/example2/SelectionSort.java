package com.hcs.designpatterns.behavioral.strategy.example2;

public class SelectionSort implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		for (int i = 0; i < values.length-1; i++) {
			for (int j = i+1; j < values.length; j++) {
				if (values[i] > values[j]) {
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
	}					
}
