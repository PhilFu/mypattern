package com.mypattern.principle.dip;

public class Client {

	public static void main(String[] args) {
		Driver zhangSan = new Driver();
		Benz benz = new Benz();
		zhangSan.drive(benz);

		IDriver driver = new Driver();
		ICar car = new Benz();
		driver.drive(car);
	}

}
