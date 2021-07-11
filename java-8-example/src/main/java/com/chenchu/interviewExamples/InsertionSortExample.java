package com.chenchu.interviewExamples;

import java.util.Arrays;

public class InsertionSortExample {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 20, 50, 60 };
		
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[i]> key ) {
				arr[j+1] = arr[i];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
}
