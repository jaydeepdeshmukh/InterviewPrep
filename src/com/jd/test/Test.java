package com.jd.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "emp1");
		Employee e2 = e1;
		e1=null;
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		
		/*----------------------------------------------------*/
		final List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		System.out.println(empList);
		List<Employee> empList1 = Collections.unmodifiableList(new ArrayList<Employee>());
		empList1.add(e1);
		System.out.println(empList1);
		/*----------------------------------------------------*/
		
//		String s4 = "Test";
//		String s1 = new String("Test");
//		String s2 = "Test";
//		String s3 = new String("Test");
//		System.out.println(s4.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		/*----------------------------------------------------*/
		
		Set<Employee> set = new HashSet<>();
		Employee emp1 = new Employee(1, "emp1");
		Employee emp2 = new Employee(1, "emp1");

		set.add(emp1);
		set.add(emp2);

		System.out.println(set.size());
	}
	
	private Integer getSum(int a, int b) {
		try{
			System.out.println("inside try");
			throw new Exception("Exception occurred");
			return a+b;
		} catch(Exception e) {
			System.out.println("inside catch");
			return 0;
		} finally {
			System.out.println("inside finally");
		}
	}
}

class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {	
		System.out.println("In hashcode "+"value is :"+this.name);
		int hash = 3;
		hash = 7 * hash + this.name.hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals " +"value is :" +this.name);
		Employee employee = (Employee)obj;
		if(employee.getName().equals(this.name)){
		return true;
		}
		return false;
	}
}



