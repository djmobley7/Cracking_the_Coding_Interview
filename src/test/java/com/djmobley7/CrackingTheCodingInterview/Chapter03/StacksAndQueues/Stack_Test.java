package com.djmobley7.CrackingTheCodingInterview.Chapter03.StacksAndQueues;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Stack_Test {
	@Test
	public void test1() {
		Stack<Integer> stack = new Stack<>();
		assertTrue(stack.isEmpty());
		
		stack.push(1);
		System.out.println(stack);
		
		stack.push(2);
		System.out.println(stack);
		
		stack.push(3);
		System.out.println(stack);
		
		assertFalse(stack.isEmpty());
		
		int value = stack.pop();
		System.out.println(stack);
		
		assertEquals(3, value);
		assertFalse(stack.isEmpty());
		
		value = stack.pop();
		System.out.println(stack);
		
		assertEquals(2, value);
		assertFalse(stack.isEmpty());
	
		value = stack.pop();
		System.out.println(stack);
		
		assertEquals(1, value);
		assertTrue(stack.isEmpty());
		
		
		System.out.println(stack);
	}
}
