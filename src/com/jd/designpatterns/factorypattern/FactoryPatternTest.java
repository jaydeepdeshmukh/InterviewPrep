package com.jd.designpatterns.factorypattern;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Profession p = FactoryClass.getObj("Engineer");
		p.print();
	}
}
