package com.jd.test;

public class Shrey extends Jay {

	static {
		System.out.println("I am static");
	}
	{
		System.out.println("intialization");
	}
	public Shrey() {
		System.out.println("I am constructor");
	}
	public Shrey(int a) {
		System.out.println("I am param constructor");
	}
	public static void main(String[] args) {
		System.out.println("I am shrey");
		Shrey s = new Shrey();
		Shrey s1 = new Shrey(1);
	}
}
