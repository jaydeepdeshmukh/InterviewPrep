package com.jd.interviews;

public class CloningTest {

	public static void main(String[] args) {
		CloneThis c1 = new CloneThis();
		
		CloneThis c2 = c1.clone();
	}
}

class CloneThis implements Cloneable {
	int  i = 0;
	
	public void passClone() {
		CloneThis c1 = new CloneThis();
		
		CloneThis c2 = (CloneThis) c1.clone();
	}
}

