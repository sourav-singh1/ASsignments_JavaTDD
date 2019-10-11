package com.java8.assignments;

public class CapitalizeFirstAndLastLetter {

	public String capitalizeFirstAndLastLetter(String testString) {

		StringBuilder newWord = new StringBuilder();
		String[] splitString = testString.split(" ");

		for (int i = 0; i < splitString.length; i++) {

			Integer strLength = splitString[i].length();
			String letter1 = splitString[i].substring(0, 1);
			String lastletter = splitString[i].substring((strLength - 1), (strLength));

			newWord.append(letter1.toUpperCase() + splitString[i].substring(1, splitString[i].length() - 1)
					+ lastletter.toUpperCase()+" ");

		}
		return newWord.substring(0, newWord.length()-1);
	}

}
