package com.chenchu.interviewExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxSubArraySum {
	public static void main(String[] args) {
		m1(10,20);
		int subArrSize = 3;
		Map<Integer, List<Integer>> map = new TreeMap<>();
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		// int[] arr= {2, 3, 4, 1, 5};
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			List<Integer> list = new ArrayList<>();
			for (int j = i; j < (i + subArrSize); j++) {
				if (arr.length > j) {
					sum = sum + arr[j];
					list.add(arr[j]);
				}
			}
			map.put(sum, list);
		}
		int maxsum = 0;
		List<Integer> maxsumList = null;
		for (Entry<Integer, List<Integer>> e : map.entrySet()) {
			if (e.getKey() > maxsum) {
				maxsum = e.getKey();
				maxsumList = e.getValue();
			}
		}
		System.out.println(maxsum + "    " + maxsumList);
	}

	public int maxSubArray(int[] nums) {

		int n = nums.length;
		int maximumSubArraySum = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;

		for (int i = 0; i < n; i++) {

			int runningWindowSum = 0;

			for (int j = i; j < n; j++) {
				runningWindowSum += nums[j];

				if (runningWindowSum > maximumSubArraySum) {
					maximumSubArraySum = runningWindowSum;
					start = i;
					end = j;
				}
			}
		}
		return maximumSubArraySum;
	}

	public static void m1(int i, int j) {
        System.out.println("a");
	}

	public static void m1(int i, Integer j) {
		 System.out.println("b");

	}

	public static void m1(Integer i, Integer j) {
		 System.out.println("c");
	}
}
