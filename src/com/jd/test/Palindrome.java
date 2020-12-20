package com.jd.test;

public class Palindrome {

	
	public static void main(String[] args) {
//		int temp, r, sum=0;
//		int i = 253;
//		temp =i;
//		while(i>0) {
//			r=i%10;
//			sum=(sum*10)+r;
//			i=i/10;
//		}
//		if(sum==temp) {
//			System.out.println("is palindrome");
//		}
//		else System.out.println("bhad me jaa");
		
		checkString("aba");
	}
	
	static void checkString(String str) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			result.append(str.charAt(i));
		}
		System.out.println(result);
		if(result.toString().equals(str)) {
			System.out.println("is palindrome");
		}
		else System.out.println("bhad me jaa");
	}
}
