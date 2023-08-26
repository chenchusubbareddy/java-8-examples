package com.chenchu.interviewExamples;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondHigestNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 6, 7 };
		int highNum = 10, secondHighNum = 10;
		for (int i = 0; i < arr.length; i++) {
			if (highNum > arr[i]) {
				secondHighNum = highNum;
				highNum = arr[i];
			} else if (secondHighNum > arr[i]) {
				secondHighNum = arr[i];
			}
		}
		System.out.println(highNum + "   " + secondHighNum);
	}

}
