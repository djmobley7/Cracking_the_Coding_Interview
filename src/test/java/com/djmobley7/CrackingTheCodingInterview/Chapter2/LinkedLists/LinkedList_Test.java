package com.djmobley7.CrackingTheCodingInterview.Chapter2.LinkedLists;

import org.junit.Before;
import org.junit.Test;

public class LinkedList_Test {
	protected LinkedList<Integer> linkedList;
	
	@Before
	public void init() {
		linkedList  = new LinkedList<>();
	}
	
	@Test
	public void addIteratively_Test() {
		linkedList.print();
		
		linkedList.addIteratively(1);
		linkedList.print();
		
		linkedList.addIteratively(2);
		linkedList.addIteratively(3);
		linkedList.addIteratively(4);
		linkedList.addIteratively(5);
		linkedList.addIteratively(6);
		linkedList.print();
	}
	
	@Test
	public void addRecursively_Test() {
		linkedList.print();
		
		linkedList.addRecursively(1);
		linkedList.print();
		
		linkedList.addRecursively(2);
		linkedList.addRecursively(3);
		linkedList.addRecursively(4);
		linkedList.addRecursively(5);
		linkedList.addRecursively(6);
		linkedList.print();
	}
}
