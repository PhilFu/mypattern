package com.mypattern.creational.builder.good;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();

	@Override
	protected void setSequence(ArrayList sequence) {
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
