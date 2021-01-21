package com.jd.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class InterfaceTest {

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		LinkedList<Integer> list1 = doProcess(myList);
		for(Integer i : list1) {
			System.out.println(i);
		}
	} 
	
	static LinkedList doProcess(LinkedList<Integer> list) {
		int temp=0;
		for(int i=0;i<list.size();i++) {
//			if((i<list.size()-1) && (list.get(i) < list.get(i+1))) {
//				System.out.println(list.get(i));
//				temp = list.get(i);
//				list.add(i, list.get(i+1));
//				list.add(i+1, temp);
//			}
			
			if(list.get(i) > temp) {
				temp = list.get(i);
				list.add(i+1, temp);
			}
		} 
		return list;
	}
}

