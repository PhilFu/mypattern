package com.mypattern.creational.prototype;

public class PrototypeClass implements Cloneable {
	@Override
	public PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
