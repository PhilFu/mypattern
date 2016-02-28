package com.mypattern.creational.abstractFactory;

public abstract class AbstractWhiteHuman implements Human {

	public void getColor() {
		System.out.println("My skin is white.");
	}

	public void talk() {
		System.out.println("I'm white.");
	}
}
