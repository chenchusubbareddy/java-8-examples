package com.chenchu.interviewExamples;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInteger1("IIVX"));

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

}
