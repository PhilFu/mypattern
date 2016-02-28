package com.mypattern.creational.abstractFactory;

public abstract class AbstractYellowHuman implements Human {

	public void getColor() {
		System.out.println("My skin is yellow.");
	}

	public void talk() {
		System.out.println("I'm yellow.");
	}
}
