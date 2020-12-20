package com.jd.interviews;

@FunctionalInterface
interface Drawable{  
    public int draw();  
    default void draw1() {System.out.println("inside interface");};  
}  

public class LambdaTest {

	public static void main(String[] args) {
		int width=10;  
        
        //with lambda  
        Drawable d2=()-> width+2;  
          
          print(d2);
	}
	
	static void print(Drawable d2) {
		System.out.println(d2.draw());
		
	}
}
