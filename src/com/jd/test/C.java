package com.jd.test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Cc implements InterfaceA {

	@Override
	public void abc() {
		System.out.println("in class");
		
	}
	
	public static void main(String[] args) {
		InterfaceA lambda = () -> System.out.println("in class");
	}

}

public class C {
	public static void main(String[] args) {
		Map<String, String> m = new Hashtable();
		m.put("1", "abc");
		for(Map.Entry<String, String> m1 : m.entrySet()) {
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		m.forEach((k,v) -> System.out.println(k));
	}
}
