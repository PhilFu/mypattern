package com.mypattern.creational.singleton;

public class Emperor {
	private static Emperor instance = new Emperor();

	private Emperor() {

	}

	public static Emperor getInstance() {
		return instance;
	}

	public void say() {
		System.out.println("I'm the emperor!");
	}
}
