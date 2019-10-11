package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNumbersOfVowelsInStringTest {
	
	@Test
	public void shouldReturnCountOFVowelsFromString() {
		
		String testString = "we are under attack";
		CountNumbersOfVowelsInString countNumbersOfVowelInString = new CountNumbersOfVowelsInString();
		int actual = countNumbersOfVowelInString.getVowelsCount(testString);
		assertEquals(7, actual);
	}

}
