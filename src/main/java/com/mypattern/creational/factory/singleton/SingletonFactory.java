package com.mypattern.creational.factory.singleton;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import com.mypattern.creational.factory.Human;
import com.mypattern.creational.factory.WhiteHuman;

public class SingletonFactory {
	private static Singleton singleton;
	static {
		try {
			Constructor c = Singleton.class.getDeclaredConstructor();
			c.setAccessible(true);
			singleton = (Singleton) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}

	private static volatile Map<String, Object> singletonMap = new HashMap<String, Object>();

	public static <T> T getSingleton(Class<T> t) {
		String name = t.getName();
		if (!singletonMap.containsKey(name)) {
			synchronized (t) {
				if (!singletonMap.containsKey(name)) {
					try {
						Constructor con = t.getDeclaredConstructor();
						con.setAccessible(true);
						singletonMap.put(name, con.newInstance());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return (T) singletonMap.get(name);
	}

	public static void main(String[] args) {
		Human white = SingletonFactory.getSingleton(WhiteHuman.class);
		Human white1 = SingletonFactory.getSingleton(WhiteHuman.class);
		System.out.println(white == white1);
	}
}
