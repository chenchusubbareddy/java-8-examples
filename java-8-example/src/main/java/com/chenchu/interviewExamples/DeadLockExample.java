package com.chenchu.interviewExamples;

class AClass {
	public synchronized void foo(BClass b) {
		System.out.println("Thread1 starts execution of foo() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 trying to call b.last()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("inside A, this is last()method");
	}
}

class BClass {

	public synchronized void bar(AClass a) {
		System.out.println("Thread2 starts execution of bar() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread2 trying to call a.last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B, this is last() method");
	}
}

public class DeadLockExample implements Runnable {
	AClass a = new AClass();
	BClass b = new BClass();

	DeadLockExample() {
		Thread t = new Thread(this);
		t.start();
		a.foo(b);// main thread
	}

	public void run() {
		b.bar(a);// child thread
	}

	public static void main(String[] args) {
		new DeadLockExample();// main thread
	}
}
