package com.chenchu.interviewExamples;

public class FibbanossiSeries {
	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34

		int n = 10;// how numbers to generate fibonossi
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n );

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + "  ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
