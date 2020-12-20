package com.jd.interviews;

class LinkedList { 
    Node head; // head of list 
  
    /* Linked list Node*/
    static class Node { 
        int data; 
        Node next; 
  
        // Constructor to create a new node 
        // Next is by default initialized 
        // as null 
        Node(int d) { data = d; next = null; } 
    } 
    
  //Method to insert a new node 
    static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 

            // Insert the new_node at last node 
            last.next = new_node; 
        } 

        // Return the list by head 
        return list; 
    } 
}

public class LinkedListDemo {
	
	// Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
        list = LinkedList.insert(list, 6); 
        list = LinkedList.insert(list, 7); 
        list = LinkedList.insert(list, 8); 
  
        // Print the LinkedList 
       // printList(list); 
    } 
}



