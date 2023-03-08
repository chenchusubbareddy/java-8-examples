package com.chenchu.interviewExamples;

public class SecondHigestNumber {
	public static void main(String[] args) {
		

		int[] arr = {18,26,26,5,27,12,5,17 };

		int highNum = 0, secondHighNum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (highNum <arr[i]) {
				secondHighNum = highNum;
				highNum = arr[i];
			} else if (secondHighNum < arr[i] &&  arr[i]!=highNum) {
				secondHighNum = arr[i];
			}
		}
		System.out.println(highNum + "   " + secondHighNum);
 
	}
}
