package com.chenchu.oops.overriding;

 class Parent {
	public void property() {
		System.out.println("cash+land+gold");
	}

	public void marry() {
		System.out.println("subbalakshmi"); // overridden method
	}
}

class Child extends Parent { // overriding
	public void marry() {
		System.out.println("3sha/4me/9tara/anushka"); //overriding method
	}
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry();// subbalakshmi(parent method)
		Child c = new Child();
		c.marry();// 3sha/nayanatara/anushka(child method)
		Parent p1 = new Child();
		p1.marry();// 3sha/nayanatara/anushka(child method)
	}
}