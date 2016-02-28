package com.mypattern.creational.abstractFactory;

public class FemaleFactory implements HumanFactory {

	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
