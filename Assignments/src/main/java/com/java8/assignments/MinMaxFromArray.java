package com.java8.assignments;

import java.util.Arrays;
import java.util.List;

public class MinMaxFromArray {

	public Integer getMinimumValueFromArray(Integer[] testArray) {
		Arrays.sort(testArray);
		return testArray[0];
	}

	public Integer getMaximumValueFromArray(Integer[] testArray) {
		Arrays.sort(testArray);
		return testArray[testArray.length-1];
	}

}
