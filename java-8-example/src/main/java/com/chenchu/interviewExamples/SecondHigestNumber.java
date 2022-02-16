package com.chenchu.interviewExamples;

public class SecondHigestNumber {
	public static void main(String[] args) {

		int[] arr = {20, 4, 2, 7, 9,21, -3,3, 6, 8, 3, 5, 7,13 };

		int highNum = 0, secondHighNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (highNum < arr[i]) {
				secondHighNum=highNum;
				highNum = arr[i];
			} else if (secondHighNum < arr[i]) {
				secondHighNum = arr[i];
			}
		}
		System.out.println(highNum + "   " + secondHighNum);
	}
}
