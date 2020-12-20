package com.jd.test;

public class Threat1Test{

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new B());
		t.start();
		System.out.println("r1");
		t.join();
		System.out.println("r2");
	}
}

class B implements Runnable {
	@Override
	public void run() {
		System.out.println("m1");
		System.out.println("m2");
	}
}
