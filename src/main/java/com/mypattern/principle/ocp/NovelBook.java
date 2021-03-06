package com.mypattern.principle.ocp;

public class NovelBook implements IBook {

	private String name;
	private int price;
	private String author;

	public NovelBook(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getAuthor() {
		return this.author;
	}

}
