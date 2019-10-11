package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java8.exception.MyNumberNotFoundException;

public class ArrayListElementsReplaceTest {

	@Test
	public void shouldReplaceElementsFromArrayListIfElementIsPresent() {

		List<Integer> asList = new ArrayList<Integer>();
		asList.add(Integer.valueOf(255));
		asList.add(Integer.valueOf(6));
		asList.add(Integer.valueOf(45));

		List<Integer> expected = new ArrayList<Integer>();
		expected.add(Integer.valueOf(255));
		expected.add(Integer.valueOf(5));
		expected.add(Integer.valueOf(45));

		ArrayListElementsReplace arrayListReplace = new ArrayListElementsReplace();
		List<Integer> actual = arrayListReplace.replaceElement(asList, 6, 5);
		assertEquals(expected, actual);

	}

	@Test(expected = MyNumberNotFoundException.class)
	public void shouldThrowNumberNotFoundExceptionWhenNumberToReplaceIsNotFoundInList() {

		List<Integer> asList = new ArrayList<Integer>();
		asList.add(Integer.valueOf(255));
		asList.add(Integer.valueOf(6));
		asList.add(Integer.valueOf(45));

		ArrayListElementsReplace arrayListReplace = new ArrayListElementsReplace();
		arrayListReplace.replaceElement(asList, 5, 5);

	}

}
