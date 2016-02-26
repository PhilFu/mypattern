package com.mypattern.creational.factory.simple;

import com.mypattern.creational.factory.BlackHuman;
import com.mypattern.creational.factory.Human;
import com.mypattern.creational.factory.WhiteHuman;
import com.mypattern.creational.factory.YellowHuman;

public class SimpleNvWa {
	public static void main(String[] args) {
		Human whiteMan = StaticHumanFactory.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();

		Human blackMan = StaticHumanFactory.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();

		Human yellowMan = StaticHumanFactory.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
	}
}
