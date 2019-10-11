package com.java8.assignments;

public class NextNumberForSeries {

	public int getNextNumber(Integer[] testArray) {

		if (testArray.length < 2)
			return 0;

		Integer firstElement = testArray[0];
		Integer secondElement = testArray[1];
		for (int i = 0; i < testArray.length/2; i++) {
			firstElement += 1;
			secondElement += 1;
		}
		if (testArray.length%2==0) 
			return firstElement;
		else
			return secondElement;

	}

}
