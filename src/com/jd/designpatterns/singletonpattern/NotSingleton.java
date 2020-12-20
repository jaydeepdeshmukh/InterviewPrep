package com.jd.designpatterns.singletonpattern;

public class NotSingleton {
	
	public static NotSingleton n = new NotSingleton();
	
	public static NotSingleton getInstance() {
		return n;
	}
}
