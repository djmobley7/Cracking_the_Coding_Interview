package com.djmobley7.CrackingTheCodingInterview.Chapter01.ArraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestions_Test {
	protected InterviewQuestions instanceToTest = new InterviewQuestions();
	
	@Test
	public void isUnique_Test() {
		assertTrue(instanceToTest.isUnique("a"));
		assertTrue(instanceToTest.isUnique("abc"));
		assertFalse(instanceToTest.isUnique("aa"));
		assertFalse(instanceToTest.isUnique("aba"));
	}
	
	@Test
	public void isPermutation_Test() {
		assertTrue(instanceToTest.isPermutation("", ""));
		
		assertFalse(instanceToTest.isPermutation("a", ""));
		assertFalse(instanceToTest.isPermutation("", "a"));
		assertTrue(instanceToTest.isPermutation("a", "a"));
		
		assertTrue(instanceToTest.isPermutation("aa", "aa"));
		assertFalse(instanceToTest.isPermutation("aa", "ab"));
		assertTrue(instanceToTest.isPermutation("abbccc", "bbaccc"));
		assertFalse(instanceToTest.isPermutation("abbccc", "bbacz"));
	}
	
	@Test
	public void isPalindromePermutation_Test() {
		assertTrue(instanceToTest.isPalindromePermutation(""));
		assertTrue(instanceToTest.isPalindromePermutation("a"));
		assertTrue(instanceToTest.isPalindromePermutation("aa"));
		assertTrue(instanceToTest.isPalindromePermutation("aaa"));
		assertTrue(instanceToTest.isPalindromePermutation("aba"));
		assertTrue(instanceToTest.isPalindromePermutation("A ba"));
		assertTrue(instanceToTest.isPalindromePermutation("baba sEE"));
		
		assertFalse(instanceToTest.isPalindromePermutation("ab"));
		assertFalse(instanceToTest.isPalindromePermutation("abc"));		
	}
	
	@Test
	public void rotateInPlace_Test() {
		char[][] array = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		array = instanceToTest.rotateInPlace(array);
		array = instanceToTest.rotateInPlace(array);
		array = instanceToTest.rotateInPlace(array);
		instanceToTest.rotateInPlace(array);
	}
}
