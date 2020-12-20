package com.jd.designpatterns.singletonpattern;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();
	
	private SingletonClass() {
	}
	
	public static SingletonClass getSingleton() {
		return instance;
	}	
}
