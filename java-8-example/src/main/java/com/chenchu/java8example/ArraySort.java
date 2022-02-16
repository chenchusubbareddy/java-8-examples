package com.chenchu.java8example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class ArraySort {
	public static void main(String[] args) {
		sortArrayInsingleLoop();
	}

	public static void sortArrayInsingleLoop() {
		int arr[] = { 12, 9, -5, 1, -4, 6, 3, 1, 7, 4, 8, 0, 11 };
		System.out.println();
		for (int j = 0; j < arr.length - 1; j++) {

			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j = -1;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
