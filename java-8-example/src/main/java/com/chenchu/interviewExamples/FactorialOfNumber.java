package com.chenchu.interviewExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int num = 10;
		int factorial = fact(num);
		System.out.println(factorial);
	}

	public static int fact(int num) {
		if (num == 0) {
			return 0;
		}
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;

	}
}
