package com.mypattern.creational.builder.good;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<String> seq = new ArrayList<String>();
		seq.add("engine boom");
		seq.add("start");
		seq.add("stop");

		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(seq);
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
	}

}
