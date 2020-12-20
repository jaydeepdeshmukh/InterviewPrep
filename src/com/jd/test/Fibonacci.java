package com.jd.test;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0, b=1,c=0;
		for(int i=0; i<10; i++) {
			if(i>1) {
				c = a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
}
