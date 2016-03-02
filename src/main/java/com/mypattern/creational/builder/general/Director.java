package com.mypattern.creational.builder.general;

public class Director {
	private Builder builder = new ConcreteBuilder();

	private Product getProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
