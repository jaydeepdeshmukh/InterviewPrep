package com.jd.designpatterns.factorypattern;

import com.jd.designpatterns.factorypattern.Profession;

public class Doctor implements Profession {

	@Override
	public void print() {
		System.out.println("I am doctor");

	}

}
