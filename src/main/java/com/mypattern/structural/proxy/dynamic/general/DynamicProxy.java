package com.mypattern.structural.proxy.dynamic.general;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static <T> T newProxyInstance(ClassLoader cl, Class<?>[] interfaces,
			InvocationHandler ih) {
		if (true) {
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(cl, interfaces, ih);
	}
}
