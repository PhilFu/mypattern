package com.mypattern.behavioral.templateMethod.hook;

public class Client {

	public static void main(String[] args) {
		HammerH1Model h1 = new HammerH1Model();
		HammerH2Model h2 = new HammerH2Model();

		h1.run();
		h2.run();
	}

}
