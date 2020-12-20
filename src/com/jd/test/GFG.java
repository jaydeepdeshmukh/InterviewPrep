package com.jd.test;

 class Car { 

	String a = "test1";

	Car(String abc) { 
		this.a=abc;
		System.out.println("car is created"); 
	} 
} 

class Maruti extends Car { 

		public Maruti() {
		}
	String b = "test2";
	void run() { 
		System.out.println("Maruti is running"); 
	} 
} 

public class GFG { 

	public static void main(String[] args) 
	{ 
		Maruti c = new Maruti(); 
		System.out.println(c.a);
		//c.run(); 
	} 
}
