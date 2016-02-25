package com.mypattern.principle.isp;

public class PrettyGirl implements IPrettyGirl {

	private String name;

	public PrettyGirl(String name) {
		this.name = name;
	}

	public void goodLooking() {
		System.out.println(this.name + " Good looking!");
	}

	public void niceFigure() {
		System.out.println(this.name + "Nice figure!");
	}

	public void greatTemperament() {
		System.out.println(this.name + "Great temperament!");
	}

}
