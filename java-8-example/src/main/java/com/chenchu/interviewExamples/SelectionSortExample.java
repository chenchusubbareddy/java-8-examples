package com.chenchu.interviewExamples;

import java.util.Arrays;

public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 40, 20, 50, 60 };

		int i, j, min, temp;
		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}
