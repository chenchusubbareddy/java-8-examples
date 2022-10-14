package com.chenchu.interviewExamples;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		int num = 370; // input number
		int sum = 0;    
		int numTemp = num; 

		int n=String.valueOf(num).length(); // to find out total number of digits
			
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			sum += Math.pow(rem, n);
		}
		if (numTemp == sum) {
			System.out.println("arm strong number:" + numTemp);
		} else {
			System.out.println("not arm strong number:" + numTemp);
		}
	}
}
