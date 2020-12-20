package com.jd.interviews;

public class MyLinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	static MyLinkedList add(MyLinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		
		if(list.head==null) {
			list.head=newNode;
		}
		else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
			
		}
		return list;
	}
	
	static void print(MyLinkedList list) {
		Node curr = list.head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list = add(list, 1);
		list = add(list, 2);
		list = add(list, 3);
		list = add(list, 4);
		
		print(list);
	}
}
