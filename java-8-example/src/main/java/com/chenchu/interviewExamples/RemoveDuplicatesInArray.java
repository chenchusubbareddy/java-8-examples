package com.chenchu.interviewExamples;

import java.util.Arrays;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int mask=0x000F;
		int value=0x2222;
		System.out.println(mask & value);
		Integer[] origArray = new Integer[] { 1, 2,0, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8,8 ,0};
		System.out.println(origArray.length);
		System.out.println(Arrays.toString(origArray));
		Integer[] tempArray = removeDuplicates(origArray);
		System.out.println(tempArray.length);
		System.out.println(Arrays.toString(tempArray));
	}

	private static Integer[] removeDuplicates(Integer[] origArray) {

		for (int j = 0; j < origArray.length - 1; j++) {
			for (int i = j + 1; i < origArray.length ; i++) {
				if (origArray[j] == origArray[i]) {
					origArray[i] = null;
				}
			}
		}

		//origArray[origArray.length - 1] = null;

		return origArray;
	}
}
