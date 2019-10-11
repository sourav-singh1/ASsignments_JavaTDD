package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class CurrentDateChangeTest {

	
	@Test
	public void shoudlReturnCurrentDate() {
		
		CurrentDateChange currenDateChange  = new CurrentDateChange();
		LocalDate actualDate = currenDateChange.getCurrentDate();
		assertEquals(LocalDate.now(), actualDate);
	}
	
	@Test
	public void shoudlReturnCurrentDateCorrectlyAfterAddingGivenNumber() {
		
		Integer numberToAdd = 8;
		CurrentDateChange currenDateChange  = new CurrentDateChange();
		LocalDate actualCurrenrtDate = currenDateChange.addNumberToLocalDate(numberToAdd);
		assertEquals(LocalDate.now().plusDays(8), actualCurrenrtDate);
	}	
}
