package com.java8.assignments;

import java.time.LocalDate;
import java.util.Date;

public class CurrentDateChange {
	
	public LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public LocalDate addNumberToLocalDate(Integer numberToAdd) {
		return LocalDate.now().plusDays(numberToAdd);
		
	}

}
