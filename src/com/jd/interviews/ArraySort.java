package com.jd.interviews;

public class ArraySort {

	public static void main(String[] args) {
		int[] a = new int[] {5,4,3,2,1};
		for (int element: a) {
            System.out.print(element);
        }
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for (int element: a) {
            System.out.print(element);
        }
	}
}
