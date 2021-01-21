package com.jd.test;

public class StaticBlockTest {

	public static void main(String[] args) {
		System.out.println("in main");
	}
}

class MyClassA {
	
	public MyClassA(int a) {
	}
}

class MyClassB extends MyClassA {
	public MyClassB() {
	}
}


