package com.jd.test;

interface Test1 {
	void display();
}

public class Anonymous {

	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("in thread");
			}
		};
		t.start();
		
		Test1 test = () -> System.out.println("displaying");
		test.display();
	}
}
