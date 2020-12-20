package com.jd.designpatterns.abstractfactorypattern;

public class AbtractFactoryProducer {

	public static AbstractFactory getProfession(boolean isTrainee) {
		if(isTrainee)
			return new TraineeFactory();
		else
			return new MainFactory();
	}

	
}
