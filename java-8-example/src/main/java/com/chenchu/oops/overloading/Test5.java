package com.chenchu.oops.overloading;

public class Test5 {
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}

	public void methodOne(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		Test5 t = new Test5();
		Animal a = new Animal();
		t.methodOne(a);// Animal version
		Monkey m = new Monkey();
		t.methodOne(m);// Monkey version
		Animal a1 = new Monkey();
		t.methodOne(a1);// Animal version
	}
}

class Animal {
}

class Monkey extends Animal {
}
