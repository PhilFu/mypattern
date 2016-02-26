package com.mypattern.creational.factory.delay;

import java.util.HashMap;
import java.util.Map;

import com.mypattern.creational.factory.Human;

public class ProductFactory {
	private static final Map<String, Human> prMap = new HashMap<String, Human>();

	public static synchronized <T extends Human> T create(Class<T> c) {
		String name = c.getName();
		if (!prMap.containsKey(name)) {
			try {
				Human human = c.newInstance();
				prMap.put(name, human);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (T) prMap.get(name);
	}
}
