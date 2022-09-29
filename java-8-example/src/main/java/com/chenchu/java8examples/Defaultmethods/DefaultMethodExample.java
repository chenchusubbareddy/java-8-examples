package com.chenchu.java8examples.Defaultmethods;

interface Interface1 {
	default void defaultMethod() {
		System.out.println("Interface1 default method");
	}
}

interface Interface2 {
	default void defaultMethod() {
		System.out.println("Interface2 default method");
	}
}

public class DefaultMethodExample implements Interface1 {
	public static void main(String[] args) {
		new DefaultMethodExample().m2();

	}

	public void m2() {
		Interface1.super.defaultMethod();
	}
}