package com.jd.test;

import java.io.IOException;

class A {
	public A() throws IOException, RuntimeException {
		System.out.println("hello");
	}
}
public class ExceptionPropogation extends A {


	public ExceptionPropogation() throws IOException, RuntimeException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		new A a();
	}
}
