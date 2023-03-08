package com.chenchu.interviewExamples;

public class DataInconsitancyProblemExample {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		Thread3 t3 = new Thread3(t);
		t3.start();
		t1.start();
		t2.start();

	}
}

class Thread1 extends Thread {
	Transaction t;

	Thread1(Transaction t) {
		this.t = t;
	}

	public void run() {
		t.doTrasancation(5000, "FlipKart");
	}
}

class Thread2 extends Thread {
	Transaction t;

	Thread2(Transaction t) {
		this.t = t;
	}

	public void run() {
		t.doTrasancation(10000, "AMAZON");
	}
}

class Thread3 extends Thread {
	Transaction t;

	Thread3(Transaction t) {
		this.t = t;
	}

	public void run() {
		t.doTrasancation(80000, "Paytm");
	}
}

class Transaction {
	int currentBal = 10000;

	public void doTrasancation(int txamount, String txtype) {

		System.out.println("======");
		synchronized (Transaction.class) {
			if (txamount <= currentBal) {
				int remainigbal = currentBal - txamount;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				currentBal = remainigbal;
				System.out.println(" The Transaction " + txamount + " is success from " + txtype
						+ ".the current balance is " + currentBal);
			} else {
				System.out.println("Not enough bal in account to do " + txamount + " from " + txtype);
			}
		}
		System.out.println("--------");
	}
}