package com.chenchu.interviewExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int num = 24;
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	public int fact(int i) {
		return 0;
	}
}
