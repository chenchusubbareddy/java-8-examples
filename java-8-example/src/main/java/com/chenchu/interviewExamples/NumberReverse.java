package com.chenchu.interviewExamples;

public class NumberReverse {

	public static void main1(String[] args) {
		int num = 1234;
		int reversed = 0;
		while (num != 0) {
			int rem = num % 10;
			reversed = reversed * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reversed Number:" + reversed);
	}

	
	public static void main(String[] args) {
//		String str = "chenchu the star am writing java code .don't get fear";
//		String[] arr=str.split(" ");
//		System.out.println(arr.length);
//		
		for (int i = 1; i <= 100; i++) {
			isprime(i);
		}

	}

	public static void isprime(int num) { // 10
		if (num == 1) {
			System.out.println("prime :" + num);

		} else {
			boolean b = false;
			for (int i = 2; i <= num/2 ; i++) {
				if (num % i == 0) {
					b = true;
					break;
				}
			}
			if (b == false) {
				System.out.println("prime:" + num);
			}
		}
	}
}
