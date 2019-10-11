package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CapitalizeFirstAndLastLetterTest {
	
	@Test
	public void shouldCapitalizeFirstAndLastLetterOfString() {
		
		String testString = "we are under attack";
		CapitalizeFirstAndLastLetter capitalizeFirstAndLastLetter =  new CapitalizeFirstAndLastLetter();
		String actual = capitalizeFirstAndLastLetter.capitalizeFirstAndLastLetter(testString);
		assertEquals("WE ArE UndeR AttacK", actual);
		
	}

}
