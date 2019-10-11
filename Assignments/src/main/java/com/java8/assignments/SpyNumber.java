package com.java8.assignments;

import java.util.Arrays;

public class SpyNumber {

	public boolean isSpyNumber(Integer testNumber) {

		String tempString = testNumber.toString();
		Integer intArray[] = new Integer[tempString.length()];
		for (int i = 0; i < tempString.length(); i++) {
			intArray[i] = Integer.parseInt("" + tempString.charAt(i));

		}
		Integer numbersProduct = Arrays.asList(intArray).stream().reduce(1, (x, y) -> x * y);
		Integer numbersSum = Arrays.asList(intArray).stream().reduce(0, (x, y) -> x + y);
		
		return ((numbersSum==numbersProduct)?true:false);
	}

}
