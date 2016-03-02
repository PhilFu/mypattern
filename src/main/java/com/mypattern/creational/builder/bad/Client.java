package com.mypattern.creational.builder.bad;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		CarModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		benz.setSequence(sequence);
		benz.run();
	}
}
