package com.chenchu.interviewExamples;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSortExample {

	public static void main(String[] args) {
		int i1=010;
		int j2=07;
		System.out.println(i1);
		System.out.println(j2);
		System.out.println("main");
		int[] arr = { 10, 40, 20, 50, 60 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		Iterator<String> itr=null;
	}
}
