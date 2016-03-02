package com.mypattern.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
	Object object = null;

	public GamePlayerIH(Object object) {
		this.object = object;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj = method.invoke(this.object, args);
		if (method.getName().equals("login")) {
			System.out.println("Somebody logined.");
		}
		return obj;
	}

}
