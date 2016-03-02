package com.mypattern.creational.builder.bad;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("Benz start.");
	}

	@Override
	protected void stop() {
		System.out.println("Benz stop.");
	}

	@Override
	protected void engineBoom() {
		System.out.println("Benz engine boom.");
	}

	@Override
	protected void alarm() {
		System.out.println("Benz alarm.");
	}

}
