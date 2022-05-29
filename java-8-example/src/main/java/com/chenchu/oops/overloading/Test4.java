package com.chenchu.oops.overloading;

public class Test4 {
	public void methodOne(int i) {
		System.out.println("general method");
	}

	public void methodOne(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.methodOne();// var-arg method
		t.methodOne(10, 20);// var-arg method
		t.methodOne(10);// general method
	}
	//In general var-arg method will get less priority that is if no other method matched then 
	//only var-arg method will get chance for execution it is almost same as default case inside 	switch.

}
