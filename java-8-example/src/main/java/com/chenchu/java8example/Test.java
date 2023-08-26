package com.chenchu.java8example;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		float f1 = 10.221f;
		float f2 = 2.1f;

		float f3 = f1 + f2;
		System.out.println(f3);
		float sum = Float.sum(f1, f2);
		System.out.println(sum);
		System.out.printf("%.3f", f3);

	}
}
