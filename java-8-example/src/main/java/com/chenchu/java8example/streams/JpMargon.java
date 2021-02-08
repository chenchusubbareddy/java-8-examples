package com.chenchu.java8example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JpMargon {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,3,4,53,2,45,67,44,8,9,6,5,3);
		List<Integer> even = list.stream().filter(i -> (i%2==0)).collect(Collectors.toList());
		System.out.println(even);
		List<Integer> odd = list.stream().filter(i -> (i%2!=0)).collect(Collectors.toList());
		System.out.println(odd);
		
		long evencount = list.stream().filter(i -> (i%2==0)).count();
		long oddcount = list.stream().filter(i -> (i%2!=0)).count();
		System.out.println("min:"+ evencount +" max: "+oddcount);	
	}
}
