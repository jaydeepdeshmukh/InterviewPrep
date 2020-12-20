package com.jd.test;

public class StringTest {

	static int i= 5;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();
		
		
	}
}

class Thread1 implements Runnable {
	@Override
	public void run() {
		
		StringTest.i++;
		System.out.println(StringTest.i);
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		
		StringTest.i++;
		System.out.println(StringTest.i);
	}
}
