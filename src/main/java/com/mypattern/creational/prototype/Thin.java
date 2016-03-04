package com.mypattern.creational.prototype;

import java.util.ArrayList;

public class Thin implements Cloneable {
	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public Thin clone() {
		Thin thin = null;
		try {
			thin = (Thin) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thin;
	}

	public void setValue(String value) {
		this.arrayList.add(value);
	}

	public ArrayList<String> getValue() {
		return this.arrayList;
	}

	public static void main(String[] args) {
		Thin thin = new Thin();
		thin.setValue("zhangsan");
		Thin cloneThing = thin.clone();
		cloneThing.setValue("lisi");
		System.out.println(cloneThing.getValue());
		System.out.println(thin.getValue());
	}
}
