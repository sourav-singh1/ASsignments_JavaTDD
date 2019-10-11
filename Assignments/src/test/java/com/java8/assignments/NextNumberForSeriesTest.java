package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NextNumberForSeriesTest {
	
	@Test
	public void shouldReturnNextNumberForSeries() {
		
		Integer[] testArray = new Integer[] {7, 10, 8, 11, 9, 12};
		NextNumberForSeries nextNumberForSeries = new NextNumberForSeries();
		int actual = nextNumberForSeries.getNextNumber(testArray);
		assertEquals(10, actual);
	}
	
	@Test
	public void shouldReturnNextNumberForSeriesForOddPairs() {
		
		Integer[] testArray = new Integer[] {7, 10, 8, 11, 9};
		NextNumberForSeries nextNumberForSeries = new NextNumberForSeries();
		int actual = nextNumberForSeries.getNextNumber(testArray);
		assertEquals(12, actual);
	}
	
	@Test
	public void shouldReturnZeroForSeriesLengthLessThan() {
		
		Integer[] testArray = new Integer[] {7};
		NextNumberForSeries nextNumberForSeries = new NextNumberForSeries();
		int actual = nextNumberForSeries.getNextNumber(testArray);
		assertEquals(0, actual);
	}

}
