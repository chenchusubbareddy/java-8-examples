package com.chenchu.interviewExamples;

import java.util.Map;

public class PrimeNumber {

	public static void main(String[] args) {
		printPrimeUpto(10);
		checkIsPime(7);
	}

	public static void printPrimeUpto(int upto) {
		for (int i = 1; i <= upto; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}

	public static void checkIsPime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				System.out.println(num + " is not prime number");
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime number");
		}
	}
}
