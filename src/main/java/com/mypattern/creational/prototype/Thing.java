package com.mypattern.creational.prototype;

public class Thing implements Cloneable {
	public Thing() {
		System.out.println("constructor executed.");
	}

	@Override
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}

	public static void main(String[] args) {
		Thing thing = new Thing();
		Thing thing2 = thing.clone();
	}
}
