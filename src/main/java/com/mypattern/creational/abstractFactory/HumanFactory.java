package com.mypattern.creational.abstractFactory;

public interface HumanFactory {
	public Human createBlackHuman();

	public Human createWhiteHuman();

	public Human createYellowHuman();
}
