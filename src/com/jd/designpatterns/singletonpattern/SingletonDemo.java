package com.jd.designpatterns.singletonpattern;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonClass s = SingletonClass.getSingleton();
		System.out.println(s.hashCode());
		SingletonClass s1 = SingletonClass.getSingleton();
		System.out.println(s1.hashCode());
		
		NotSingleton n = NotSingleton.getInstance();
		System.out.println(n.hashCode());
		NotSingleton n1 = NotSingleton.getInstance();
		System.out.println(n1.hashCode());
	}
}
