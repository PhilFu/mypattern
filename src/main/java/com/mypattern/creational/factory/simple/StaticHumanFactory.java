package com.mypattern.creational.factory.simple;

import com.mypattern.creational.factory.Human;

public class StaticHumanFactory {
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("Create human failed.");
		}
		return (T) human;
	}
}
