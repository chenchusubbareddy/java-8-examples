package com.chenchu.interviewExamples;

public class FibbanossiSeries {
	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34

		int n1 = 0, n2 = 1, n3 = 0;
		int upto = 10;
		System.out.print(n1 + "  " + n2 + "  ");
		for (int i = 2; i <= upto; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + "  ");
			n1 = n2;
			n2 = n3;
		}
	}
}
