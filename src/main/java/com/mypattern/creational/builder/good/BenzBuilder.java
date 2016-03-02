package com.mypattern.creational.builder.good;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	protected void setSequence(ArrayList sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
