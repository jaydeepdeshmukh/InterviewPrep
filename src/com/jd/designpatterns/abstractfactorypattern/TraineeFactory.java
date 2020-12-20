package com.jd.designpatterns.abstractfactorypattern;

public class TraineeFactory extends AbstractFactory {

	@Override
	Profession getProfession(String profession) {
		Profession p = null;
		if("Doctor".equalsIgnoreCase(profession)) p = new TraineeDoctor();
		if("Engineer".equalsIgnoreCase(profession)) p = new TraineeEngineer();
		return p;
	}

}
