package com.java8.assignments;

import java.util.List;

public class SubListFromArrayList {

	public List<Integer> getSublist(List<Integer> testList, Integer startIndex, Integer lastIndex) {
		
		return testList.subList(startIndex, lastIndex+1);
	}

}
