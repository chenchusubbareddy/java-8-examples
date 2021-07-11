package com.chenchu.java8example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int count, temp;

		sortArrayInsingleLoop();
	}

	public static void sortArrayInsingleLoop() {
		int arr[] = { 12,9, -5, 1, -4, 6, 3, 1, 7, 4, 8, 0,11 };
		System.out.println();
		for (int j = 0; j < arr.length - 1; j++) {
			// Checking the condition for two
			// simultaneous elements of the array
			if (arr[j] > arr[j + 1]) {
				// Swapping the elements.
				int temp = arr[j];
				arr[j] = arr[j + 1];//*arr[j + 1];
				arr[j + 1] = temp;

				// updating the value of j = -1
				// so after getting updated for j++
				// in the loop it becomes 0 and
				// the loop begins from the start.
				j = -1;
			}
		}
	

		System.out.println(Arrays.toString(arr));
	}

}
