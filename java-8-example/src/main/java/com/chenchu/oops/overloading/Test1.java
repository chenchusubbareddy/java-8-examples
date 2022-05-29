package com.chenchu.oops.overloading;

public class Test1 {
	public void methodOne(String s) {
		System.out.println("String version");
	}

	public void methodOne(Object o) {
		System.out.println("Object version");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.methodOne("arun");// String version
		t.methodOne(new Object());// Object version
		t.methodOne(null);// String version
	}
}