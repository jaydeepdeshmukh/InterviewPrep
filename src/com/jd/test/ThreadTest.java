package com.jd.test;

public class ThreadTest implements Runnable{	
	
	public void run() {
		System.out.print("running");
	}
	
	public static void main(String[] args) {
		Thread t= new Thread(new ThreadTest());
		t.run();
		t.run();
		t.start();
	}
}




