package com.mypattern.creational.builder.good;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	public BenzModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("engine boom");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
}
