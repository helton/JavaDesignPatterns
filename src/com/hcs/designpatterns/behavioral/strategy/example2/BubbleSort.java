package com.hcs.designpatterns.behavioral.strategy.example2;

public class BubbleSort implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
        for(int i = 0; i < values.length; i++) {
            for(int j = 1; j < (values.length-i); j++) {                   
                    if(values[j-1] > values[j]) {
                            //swap the elements!
                            int temp = values[j-1];
                            values[j-1] = values[j];
                            values[j] = temp;
                    }                   
            }
        }
	}
}
