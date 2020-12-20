package com.jd.designpatterns.abstractfactorypattern;

public class MainFactory extends AbstractFactory {

	@Override
	Profession getProfession(String profession) {
		Profession p = null;
		if("Doctor".equalsIgnoreCase(profession)) p = new Doctor();
		if("Engineer".equalsIgnoreCase(profession)) p = new Engineer();
		return p;
	} 

	
}
