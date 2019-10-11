package com.java8.assignments;

public class CountNumbersOfVowelsInString {

	public int getVowelsCount(String testString) {
		
		return testString.replaceAll("[^aeiouAEIOU]", "").length();
	}
	

}
