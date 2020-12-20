package com.jd.test;

public class Swapping {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		
		s1 = s1+s2;
		System.out.println(s1.length());
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s2);
		System.out.println(s1);
		
		int n1 = 5;
		int n2 = 32;
		
		n1 = n1+n2;
		n2= n1-n2;
		n1 = n1-n2;
		System.out.println(n2);
		System.out.println(n1);
				
	}
}
