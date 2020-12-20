package com.jd.Threads;

import java.io.Serializable;

class MyThread extends Thread {

	static {
		System.out.println("I am static");
	}
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
//		t.start();
		System.out.println("Main Thread");
	}
}


