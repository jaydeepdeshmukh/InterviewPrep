package com.jd.designpatterns.abstractfactorypattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory fact = AbtractFactoryProducer.getProfession(false);
		Profession p = fact.getProfession("Doctor");
		p.print();
	}
}
