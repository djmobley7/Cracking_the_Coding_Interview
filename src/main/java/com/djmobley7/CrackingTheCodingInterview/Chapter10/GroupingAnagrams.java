package com.djmobley7.CrackingTheCodingInterview.Chapter10;

import java.util.HashMap;
import java.util.Map;

public class GroupingAnagrams {
	protected boolean isAnagram(String a, String b) {
		Map<Character, Integer> aParts = getParts(a);
		Map<Character, Integer> bParts = getParts(b);
		
		if (aParts.size() != bParts.size()) {
			return false;
		}
		
		boolean result = true;
		for (Character c : aParts.keySet()) {
			if (!bParts.containsKey(c)) {
				result = false;
				break;
			}
			
			if (aParts.get(c) != bParts.get(b)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	protected Map<Character, Integer> getParts(String str) {
		Map<Character, Integer> parts = new HashMap<>();
		for (int i = 0; i < str.length(); ++i) {
			Character c = Character.valueOf(str.charAt(i));
			parts.putIfAbsent(c, 0);
			parts.put(c, parts.get(c) + 1);
		}
		return parts;
	}
}
