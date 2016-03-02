package com.mypattern.structural.proxy.dynamic.general;

import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler ih = new MyInvocationHandler(subject);
		Class cl = subject.getClass();
		Subject proxySubject = DynamicProxy.newProxyInstance(
				cl.getClassLoader(), cl.getInterfaces(), ih);
		proxySubject.doSomething();

		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething();
	}
}
