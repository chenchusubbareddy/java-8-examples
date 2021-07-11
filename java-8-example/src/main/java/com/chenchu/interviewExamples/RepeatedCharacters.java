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
}
