package com.jd.interviews;

import java.util.Date;

public class ImmutableTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ImmutableClass ic1 = new ImmutableClass(1);
		
//		System.out.println("before ic1 uc1: "+ic1.getDate().getHours());
//		
//		ImmutableClass ic2 = (ImmutableClass) ic1.clone();
//		ic1.getDate().setHours(1);
//		System.out.println("after ic1: "+ic1.getDate().getHours());
//		System.out.println("after ic2: "+ic2.getDate().getHours());
		
		System.out.println("before cloning street ic1: "+ic1.getAddr().street);
		
		
		ImmutableClass ic2 = (ImmutableClass) ic1.clone();
		Address a = ic1.getAddr();
		a.setStreet("xyz");
		ic1.setAddr(a);
		
		
		System.out.println("before cloning street ic1: "+ic1.getAddr().getStreet());
		System.out.println("before cloning street ic2: "+ic2.getAddr().getStreet());
		
	}
}

final class ImmutableClass implements Cloneable {
	
	private int id;
	private Date date = new Date();
	private Address addr=new Address();
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		} 
	public ImmutableClass(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

//	public Date getDate() {
//		return (Date) date.clone();
//	}
	
	public Address getAddr() throws CloneNotSupportedException {
		return (Address) addr.clone();
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	
	
}

class Address implements Cloneable{
	String street;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String street) {
		this.street=street;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
