package com.chenchu.interviewExamples;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 };
		leftRotation(arr, 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void leftRotation(int[] arr, int k) {
		if (k == 0 || k % arr.length == 0)
			return;
		//k = k % arr.length;
		for (int i = 0; i < k; i++) {
			int firstele = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = firstele;
		}
		
	}

	public static void rightRotateByOne(int[] arr, int k) {

		if (k == 0 || k % arr.length == 0)
			return;
		//k = k % arr.length;
		for (int j = 0; j < k; j++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = last;
		}
	}
}
