package com.mypattern.principle.dip;

public class Driver implements IDriver {
	// TODO abandon
	public void drive(Benz benz) {
		benz.run();
	}

	//interface injection
	public void drive(ICar car) {
		car.run();
	}
	
	//Constructor injection
/*	private ICar car;
	public Driver(ICar car) {
		this.car = car;
	}
	public void drive(ICar car) {
		this.car.run();
	}*/
}
