package com.jd.test;



class Bird {
	{ System.out.print("m1 "); }
	public Bird() {
		System.out.print("m2 ");
	}
}

class Raptor extends Bird  {
	static { System.out.print("r1 ");}
	{ System.out.print("b1 "); }
	public Raptor() {
		System.out.print("b2 ");
	}
	static { System.out.print("r2 "); }
}

public class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.print("pre ");
		new Hawk();
		System.out.print("hawk");
	}
}

