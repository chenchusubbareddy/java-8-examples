package com.chenchu.interviewExamples;

public class ArmStrongNumber {
	public static void main(String[] args) {

		// ex 153: 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125+ 27 = 153
		int num = 153;
		int sum = 0;
		int numTemp = num;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + (rem * rem * rem);
		}
		if (numTemp == sum) {
			System.out.println("arm strong number:" + numTemp);
		}else {
			System.out.println("not arm strong number:" + numTemp);
		}
	}

}
