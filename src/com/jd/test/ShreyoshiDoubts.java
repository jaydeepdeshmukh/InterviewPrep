package com.jd.test;

import java.util.Arrays;
import java.util.HashMap;

public class ShreyoshiDoubts {

	public static void main(String[] args) {
//		printNos(10);
//
//		System.out.println();
//		// Get the array 
//        int arr[] 
//            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
//  
//        // Get the String representation of array 
//        String stringArr = Arrays.toString(arr); 
//  
//        // print the String representation 
//        System.out.println("Array: " + stringArr); 
        int count=0;
        System.out.println();
        count++;
        if(count<3) {
        	main(null);
        }
        
	}
	
	// Prints numbers from 1 to n 
    static void printNos(int n) 
    { 
        if(n > 0) 
        { 
            printNos(n - 1); 
            System.out.print(n + " "); 
        } 
        return; 
    } 
}

