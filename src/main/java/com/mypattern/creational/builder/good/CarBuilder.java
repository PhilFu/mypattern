package com.mypattern.creational.builder.good;

import java.util.ArrayList;

public abstract class CarBuilder {
	protected abstract void setSequence(ArrayList sequence);

	public abstract CarModel getCarModel();
}
