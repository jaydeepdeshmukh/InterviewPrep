package com.jd.interviews;

public class SingletonTest {

	public static void main(String[] args) {
		FirstClass fc = FirstClass.getInstance();
		System.out.println(fc.hashCode());
		FirstClass fc1 = FirstClass.getInstance();
		System.out.println(fc1.hashCode());
		
		SecondClass sc = FirstClass.sc;
		System.out.println(sc.hashCode());
		SecondClass sc1 = FirstClass.sc;
		System.out.println(sc1.hashCode());

	}

}

class FirstClass {

	private static FirstClass at;
	public static SecondClass sc;
	
	private FirstClass() {
		sc = new SecondClass();
		System.out.println("sc ::"+sc.hashCode());
	}
	public static FirstClass getInstance() {
		if(at==null) {
			at = new FirstClass();
		}
		return at;
	}
}

class SecondClass {
	
}

