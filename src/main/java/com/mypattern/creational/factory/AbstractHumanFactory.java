package com.mypattern.creational.factory;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> Human createHuman(Class<T> c);
}
