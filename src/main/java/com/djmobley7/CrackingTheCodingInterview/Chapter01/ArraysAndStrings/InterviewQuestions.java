package com.djmobley7.CrackingTheCodingInterview.Chapter01.ArraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewQuestions {
	public boolean isUnique(String str) {
		Set<Byte> bytes = new HashSet<>();
		
		for (Byte b : str.getBytes()) {
			if (bytes.contains(b)) {
				return false;
			}
			bytes.add(b);
		}
		
		return true;
	}
	
	public boolean isPermutation(String str1, String str2) {
		Map<Byte, Integer> strParts = getParts(str1);
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		for (Byte b : str2.getBytes()) {
			if (!strParts.containsKey(b)) {
				return false;
			}
			
			Integer count = strParts.get(b);
			if (count == 0) {
				return false;
			}
			
			strParts.put(b, count - 1);
		}
		
		return true;
	}
	
	protected Map<Byte, Integer> getParts(String str) {
		Map<Byte, Integer> parts = new HashMap<>();
		
		for (Byte b : str.getBytes()) {
			Integer count = 1;
			if (parts.containsKey(b)) {
				count = parts.get(b) + 1;
			}
			
			parts.put(b, count);
		}
		
		return parts;
	}
	
	public boolean isPalindromePermutation(String str) {
		Map<Character, Integer> parts = new HashMap<>();
		
		// get string char and letter count
		int letterCount = 0;
		for (int i = 0; i < str.length(); ++i) {
			Character c = str.charAt(i);
			
			if (!Character.isLetter(c)) {
				continue;
			}
			
			c = Character.toLowerCase(c);
			++letterCount;
			
			if (!parts.containsKey(c)) {
				parts.put(c, 0);
			}
			parts.put(c, parts.get(c) + 1);
		}
		
		boolean needOddCount = false;
		if (letterCount % 2 == 1) {
			needOddCount = true;
		}
		
		for (Character c : parts.keySet()) {
			int count = parts.get(c);
			if (count % 2 == 1) {
				if (needOddCount) {
					needOddCount = false;
				} else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public char[][] rotateInPlace(char[][] array) {
//		123
//		456
//		789
//		
//		741
//		852
//		963
		
//		1 (0, 0) -> (0, 2)
//		2 (0, 1) -> (1, 2)
//		3 (0, 2) -> (2, 2)
//		
//		4 (1, 0) -> (0, 1)
//		5 (1, 1) -> (1, 1)
//		6 (1, 2) -> (2, 1)
//		
//		7 (2, 0) -> (0, 0)
//		8 (2, 1) -> (1, 0)
//		9 (2, 2) -> (2, 0)
		
		System.out.println("Before:");
		printArray(array);
		
		int w = array.length;
		int h = array[0].length;
		
		// check if square
		if (w != h) {
			System.out.println("Can't rotate array, not square");
			return array;
		}
			
		char[][] rotated = new char[w][w];
		
		for (int i = 0; i < w; ++i) {
			for (int j = 0; j < w; ++j) {
				char c = array[i][j];
				
				int x = j;
				int y = w - i - 1;
				
				rotated[x][y] = c;
			}
		}
		
		System.out.println("After:");
		printArray(rotated);
		
		return rotated;
	}
	
	protected void printArray(char[][] array) {
		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array.length; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
