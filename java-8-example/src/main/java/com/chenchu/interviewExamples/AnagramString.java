package com.chenchu.interviewExamples;

public class AnagramString {
	public static void main(String[] args) {
		String word = "now";
		String anagram = "own";
		if (word.length() != anagram.length()) {
			System.out.println("two strings are not anagram");
			return;
		}

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				System.out.println("two strings are not anagram");
				return;
			}
		}
		if (anagram.isEmpty()) {
			System.out.println("two strings are anagram");
		} else {
			System.out.println("two strings are not anagram");
		}
	}
}
