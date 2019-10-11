package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinMaxFromArrayTest {
	
	@Test
	public void shouldReturnMinimumElementFromArray() {
		
		Integer[] testArray = new Integer[] {1,4,5,8,2,76,123,765,12};
		MinMaxFromArray minMaxFromArray = new MinMaxFromArray();
		Integer actual = minMaxFromArray.getMinimumValueFromArray(testArray);
		assertEquals(1, actual);
		
	}
	@Test
	public void shouldReturnMaximumElementFromArray() {
		
		Integer[] testArray = new Integer[] {1,4,5,8,2,76,123,765,12};
		MinMaxFromArray minMaxFromArray = new MinMaxFromArray();
		Integer actual = minMaxFromArray.getMaximumValueFromArray(testArray);
		assertEquals(765, actual);
		
	}

}
