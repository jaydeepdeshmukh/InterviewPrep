package com.jd.interviews;

import java.util.Arrays;

public class MyArrayList {

	private Object[] store;
	private int size=0;
	
	public MyArrayList() {
		store = new Object[10];
	}
	
	public void add(Object obj) {
		if(store.length-size <= 5) {
			increaseListSize();
		}
		store[size++] = obj;
	}
	
	public Object get(int index) {
		if(index < size) {
			return store[index];
		}
		else throw new IndexOutOfBoundsException();
	}
	
	public Object remove(int index) {
		if(index < size) {
			Object obj = store[index];
			store[index]=null;
			int tmp = index;
			while(tmp < size) {
				store[tmp] = store[tmp+1];
				store[tmp+1] = null;
				tmp++;
			}
			size--;
			return obj;
		}
		else throw new IndexOutOfBoundsException();
	}
	private void increaseListSize() {
		store = Arrays.copyOf(store, store.length*2);
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+" ");
		}
		
		list.remove(1);
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
