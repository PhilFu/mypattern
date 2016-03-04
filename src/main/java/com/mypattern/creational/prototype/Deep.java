package com.mypattern.creational.prototype;

import java.util.ArrayList;

public class Deep implements Cloneable {
	private ArrayList<String> list = new ArrayList<String>();

	@Override
	public Deep clone() {
		Deep deep = null;
		try {
			deep = (Deep) super.clone();
			deep.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return deep;
	}

	public void setValue(String string) {
		this.list.add(string);
	}

	public ArrayList<String> getValue() {
		return this.list;
	}

	public static void main(String[] args) {
		Deep deep = new Deep();
		deep.setValue("zhangsan");

		Deep cloneDeep = deep.clone();
		cloneDeep.setValue("lisi");

		System.out.println(deep.getValue());
		System.out.println(cloneDeep.getValue());
	}
}
