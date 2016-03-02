package com.mypattern.structural.proxy.dynamic.general;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {

	public static Subject newProxyInstance(Subject subject) {
		ClassLoader cl = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		return (Subject) Proxy.newProxyInstance(cl, interfaces, handler);
	}
}
