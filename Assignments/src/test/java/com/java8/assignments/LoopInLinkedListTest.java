package com.java8.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java8.assignments.MyLinkedList.Node;

public class LoopInLinkedListTest {

	@Test
	public void shouldReturnCountOfLoopInLinkedList() {
		LoopInLinkedList loopInLinkedList = new LoopInLinkedList();
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.head = new Node(1);
		myLinkedList.head.next = new Node(2);
		Node node = myLinkedList.head.next.next = new Node(3);
		myLinkedList.head.next.next.next = new Node(4);
		myLinkedList.head.next.next.next.next = new Node(5);
		myLinkedList.head.next.next.next.next.next = node;
		int actual = loopInLinkedList.lengthOfLoop(myLinkedList);
		assertEquals(3, actual);
	}
	
	@Test
	public void shouldReturnZeroIfSingleNodeLinkedList() {
		LoopInLinkedList loopInLinkedList = new LoopInLinkedList();
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.head = new Node(1);
		int actual = loopInLinkedList.lengthOfLoop(myLinkedList);
		assertEquals(0, actual);
	}
	
	@Test
	public void shouldReturnZeroIfEmptyLinkedList() {
		LoopInLinkedList loopInLinkedList = new LoopInLinkedList();
		MyLinkedList myLinkedList = new MyLinkedList();
		int actual = loopInLinkedList.lengthOfLoop(myLinkedList);
		assertEquals(0, actual);
	}
	@Test
	public void shouldReturnZeroIfEmadsptyLinkedList() {
		LoopInLinkedList loopInLinkedList = new LoopInLinkedList();
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.head = new Node(1);
		myLinkedList.head.next = new Node(2);
		int actual = loopInLinkedList.lengthOfLoop(myLinkedList);
		assertEquals(0, actual);
	}

}
