package com.jd.designpatterns.factorypattern;

public class FactoryClass {

	public static Profession getObj(String profession) {
		
		Profession obj=null;
		if("Doctor".equalsIgnoreCase(profession)) obj = new Doctor();
		if("Engineer".equalsIgnoreCase(profession)) obj = new Engineer();
		if("Teacher".equalsIgnoreCase(profession)) obj = new Teacher();
		return obj;
	}
}
