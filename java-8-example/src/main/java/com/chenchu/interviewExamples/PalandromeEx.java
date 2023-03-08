package com.chenchu.interviewExamples;

public class PalandromeEx {

	public static void main(String[] args) {
		boolean ispalndrome = numberPalandrome(1234);
		if (ispalndrome) {
			System.out.println("palandrome");

		}else {
			System.out.println("Not palandrome");
		}

	}

	public static boolean numberPalandrome(long num) {
		if (num < 0) {
			return false;
		}
		System.out.println(num);

		long temp = num;
		long sum = 0;
		while (num > 0) {
			long rem = num % 10; // getting remainder
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (num == temp) {
			return true;
		} else {
			return numberPalandrome(temp + temp);
		}
	}
}
