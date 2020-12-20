package com.jd.interviews;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<Employee, String>();
		
		map.put(new Employee("key1"),"value1");
		map.put(new Employee("key2"),"value1");
		map.put(new Employee("key2"),"value2");
		map.put(new Employee("key1"),"value2");
		
		System.out.println(map.size());
	}
}

class Employee {
	
	public Employee(String key) {
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
