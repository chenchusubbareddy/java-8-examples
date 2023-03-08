package com.chenchu.interviewExamples;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInteger1("XVIII"));
		System.out.println(romanTOInteger("XVIII"));
	}

	public static final int romanToInteger1(String roman) {

		int number = 0;
		for (int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			switch (c) {
			case 'I':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X'))
						? number - 1
						: number + 1;
				break;
			case 'V':
				number += 5;
				break;
			case 'X':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C'))
						? number - 10
						: number + 10;
				break;
			case 'L':
				number += 50;
				break;
			case 'C':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M'))
						? number - 100
						: number + 100;
				break;
			case 'D':
				number += 500;
				break;
			case 'M':
				number += 1000;
				break;
			}
		}

		return number;
	}

	public static final int romanTOInteger(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer integer = null;
			Integer integer2 = null;
			if (i > 0) {
				integer = map.get(s.charAt(i));
				integer2 = map.get(s.charAt(i - 1));
			}

			if (i > 0 && integer > integer2) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
			} else {
				Integer integer3 = map.get(s.charAt(i));
				result += integer3;
			}
		}
		return result;
	}

}
