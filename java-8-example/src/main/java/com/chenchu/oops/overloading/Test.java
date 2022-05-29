package com.chenchu.oops.overloading;

public class Test {
	public void methodOne(char i) {
		System.out.println("char-arg method");
	}

	public void methodOne(int i) {
		System.out.println("int-arg method");
	}

	public void methodOne(float f) // overloaded methods
	{
		System.out.println("float-arg method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne('a');// int-arg method
		t.methodOne(10);// int-arg method
		t.methodOne(10L);// float-arg method
		//t.methodOne(10.5);// C.E:cannot find symbol
	}
}
