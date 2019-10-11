package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddNumberOutTest {
	
	@Test
	public void shouldReturnOddNumberFromSeries() {
		
		Integer[] testArray = new Integer[] {3,12,8,19,13,32,18,42,23,52};
		OddNumberOut oddNumberOut = new OddNumberOut();
		Integer actual = oddNumberOut.getOddOneOut(testArray);
		assertEquals(19, actual);
		
	}
	@Test
	public void shouldReturnWrongNumberFromSeries() {
		
		Integer[] testArray = new Integer[] {3,12,8,22,11,32,18,42,23,52};
		OddNumberOut oddNumberOut = new OddNumberOut();
		Integer actual = oddNumberOut.getOddOneOut(testArray);
		assertEquals(11, actual);
		
	}
	@Test
	public void shouldReturZeroFromSeriesIfNoWrongNumbersAreThere() {
		
		Integer[] testArray = new Integer[] {3,12,8,22,13,32,18,42,23,52};
		OddNumberOut oddNumberOut = new OddNumberOut();
		Integer actual = oddNumberOut.getOddOneOut(testArray);
		assertEquals(0, actual);
		
	}
	@Test
	public void shouldReturZeroFromSeriesIfAnEmptyListIsPassed() {
		
		Integer[] testArray = new Integer[] {};
		OddNumberOut oddNumberOut = new OddNumberOut();
		Integer actual = oddNumberOut.getOddOneOut(testArray);
		assertEquals(0, actual);
		
	}

}
