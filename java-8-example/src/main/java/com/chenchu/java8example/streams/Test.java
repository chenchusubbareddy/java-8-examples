package com.chenchu.java8example.streams;


public class Test {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		boolean b= s1 == s2;
		System.out.println("s1 == s2 is:" +b);
		
		System.out.println("s1 == s2 is:::" + (s1 == s2));
		System.out.println("s1 === s2 is::" + (s1 == s2));

	}

}
