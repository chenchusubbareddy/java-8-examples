package com.chenchu.interviewExamples;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String str = "chenchu the star";
		String s = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

	public static void firstNonRepeatingCHaracter() {
		String str1 = "gibblegabbler";
		
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}
	}
}
