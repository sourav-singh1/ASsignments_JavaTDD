package com.java8.assignments;

public class OddNumberOut {

	public Integer getOddOneOut(Integer[] testArray) {

		for (int i = 0, j = 1; i < testArray.length-1 && j < testArray.length-2; i += 2, j += 2) {
			if (testArray[i + 2] - testArray[i] != 5)
				return testArray[i+2];
			 if (testArray[j + 2] - testArray[j] != 10)
				return testArray[j+2];
		}
		return 0;
	}

}
