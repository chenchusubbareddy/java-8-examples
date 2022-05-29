package com.chenchu.interviewExamples;

import java.util.List;

public class StrongNumber {

	public static void main(String[] args) {
		// sum of factorial of each digit == original number
		// ex 145 = 145 (1 + 24 + 120)
		int num = 145;
		int dupNum=num;
		// get each digit in number
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;

			sum = sum + getfactorialOfNumber(rem);
		}
		System.out.println("sum :" + sum);
		if (dupNum == sum) {
			System.out.println("the number " + dupNum + " is strong number");
		}else {
			System.out.println("the number " + dupNum + " is not strong number");
		}
	}

	public static int getfactorialOfNumber(int digit) {
		int fact = 1;
		for (int i = 1; i <= digit; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of digit :"+digit+ " is :"+fact);
		return fact;
	}
}
