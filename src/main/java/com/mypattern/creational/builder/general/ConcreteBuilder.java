package com.mypattern.creational.builder.general;

public class ConcreteBuilder extends Builder {
	private Product product = new Product();

	@Override
	public void setPart() {
		// TODO this.product.set...
	}

	@Override
	public Product buildProduct() {
		return this.product;
	}

}
