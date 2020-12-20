package com.jd.test;

public class Random {

	public String invade(short i) { return "a few"; };
	public String invade(short a, short... i) {
		System.out.println(a);
		System.out.println(i.length);
		return "a many"; 
	};
}

class RandomTest extends Random {
	
	public static void main(String[] args) {
		short i=1, j =2, k=3;
		System.out.println(new Random().invade(i, j, k));
	}
}