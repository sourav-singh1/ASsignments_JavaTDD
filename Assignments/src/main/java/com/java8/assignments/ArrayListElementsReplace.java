package com.java8.assignments;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.exception.MyNumberNotFoundException;

public class ArrayListElementsReplace {

	public List<Integer> replaceElement(List<Integer> elementsList, Integer toReplace, Integer replace) {

		if(!elementsList.contains(toReplace)) {
			throw new MyNumberNotFoundException("Element not found to be replace");
		}
		
		return elementsList.stream()
				.map(element -> element == toReplace ? replace : element).collect(Collectors.toList());

	}

}
