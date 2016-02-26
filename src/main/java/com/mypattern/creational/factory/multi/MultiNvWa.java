package com.mypattern.creational.factory.multi;

import com.mypattern.creational.factory.Human;

public class MultiNvWa {
	public static void main(String[] args) {
		HumanFactory blackFactory = new BlackFactory();
		Human black = blackFactory.createHuman();
		black.getColor();
		black.talk();
	}
}
