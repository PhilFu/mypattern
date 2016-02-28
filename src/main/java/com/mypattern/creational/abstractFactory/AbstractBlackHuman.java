package com.mypattern.creational.abstractFactory;

public abstract class AbstractBlackHuman implements Human {

	public void getColor() {
		System.out.println("My skin is black.");
	}

	public void talk() {
		System.out.println("I'm black.");
	}
}
