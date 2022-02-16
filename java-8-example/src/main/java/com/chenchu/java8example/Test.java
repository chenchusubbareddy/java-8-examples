package com.chenchu.java8example;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("acd");
		set.add("aaa");
		set.add("bas");
		set.add("cac");
		set.add("acd");
		System.out.println(set.floor("abc"));
		System.out.println(set.ceiling("aca"));
		System.out.println(set.higher("aab"));
	}

}
