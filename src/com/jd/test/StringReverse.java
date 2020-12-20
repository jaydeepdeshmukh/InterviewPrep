package com.jd.test;

public class StringReverse {

	public static void main(String[] args) {
		String toTest = "abc";
		
		String result="";
		for(int i=toTest.length()-1;i>=0;i--) {
			result+=toTest.charAt(i);
		}
		System.out.println(result);
		
		String a = "abc";
		String b = "def";
		a.concat(b);
		System.out.println(a);
	}
}
