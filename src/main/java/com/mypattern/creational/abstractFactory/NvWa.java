package com.mypattern.creational.abstractFactory;

public class NvWa {

	public static void main(String[] args) {
		HumanFactory femaleFactory = new FemaleFactory();
		HumanFactory maleFactory = new MaleFactory();

		Human maleYellowHuman = maleFactory.createYellowHuman();
		Human femaleYellowHuman = femaleFactory.createYellowHuman();

		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();

		femaleYellowHuman.getColor();
		femaleYellowHuman.getSex();
		femaleYellowHuman.talk();

	}

}
