package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpyNumberTest {
	
	@Test
	public void shouldReturnTrueIfTheGivenNumberIsASpyNumber() {
		
		Integer testNnumber = 1412;
		SpyNumber spyNumber = new SpyNumber();
		boolean actual = spyNumber.isSpyNumber(testNnumber);
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldReturnFalseIfTheGivenNumberIsNotASpyNumber() {
		
		Integer testNnumber = 1207;
		SpyNumber spyNumber = new SpyNumber();
		boolean actual = spyNumber.isSpyNumber(testNnumber);
		assertEquals(false, actual);
	}

}
