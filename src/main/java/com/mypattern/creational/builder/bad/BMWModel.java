package com.mypattern.creational.builder.bad;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("BMW start.");
	}

	@Override
	protected void stop() {
		System.out.println("BMW stop.");
	}

	@Override
	protected void engineBoom() {
		System.out.println("BMW engine boom.");
	}

	@Override
	protected void alarm() {
		System.out.println("BMW alarm.");
	}

}
