package com.mypattern.creational.factory;

public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		Human whiteMan = factory.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();

		Human blackMan = factory.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();

		Human yellowMan = factory.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
	}

}
