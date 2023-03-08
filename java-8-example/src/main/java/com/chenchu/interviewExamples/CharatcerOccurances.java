package com.chenchu.interviewExamples;

import java.util.Scanner;

public class CharatcerOccurances {

	public static void main(String[] args) {
		String str;
		int i, length, counter[] = new int[256];

		
		str ="abcdabca";

		length = str.length();

		// Count frequency of every character and store
		// it in counter array
		for (i = 0; i < length; i++) {
			counter[(int) str.charAt(i)]++;
		}
		// Print Frequency of characters
		for (i = 0; i < 256; i++) {
			if (counter[i] != 0) {
				System.out.println((char) i + " --> " + counter[i]);
			}
		}

	}
}
