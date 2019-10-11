package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubListFromArrayListTest {
	
	@Test
	public void shouldReturnSublistFromArrayListForValidStartAndLastIndex() {
		
		Integer startIndex = 3;
		Integer lastIndex = 7;
		Integer[] testArray = new Integer[]{321,43,23,1,23,13,31,41,41,2};
		List<Integer> testList = Arrays.asList(testArray);
		Integer[] expectedTestArray = new Integer[]{1,23,13,31,41};
		List<Integer> expectedList = Arrays.asList(expectedTestArray);
		SubListFromArrayList subListFromArrayList = new SubListFromArrayList();
		List<Integer> actual = subListFromArrayList.getSublist(testList, startIndex, lastIndex);
		assertEquals(expectedList, actual);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowExceptionIfIndexIsOutOfBound() {
		Integer startIndex = 3;
		Integer lastIndex = 12;
		Integer[] testArray = new Integer[]{321,43,23,1,23,13,31,41,41,2};
		List<Integer> testList = Arrays.asList(testArray);
		Integer[] expectedTestArray = new Integer[]{1,23,13,31,41};
		List<Integer> expectedList = Arrays.asList(expectedTestArray);
		SubListFromArrayList subListFromArrayList = new SubListFromArrayList();
		List<Integer> actual = subListFromArrayList.getSublist(testList, startIndex, lastIndex);
	}
}
