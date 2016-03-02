package com.mypattern.structural.proxy.dynamic.general;

public class BeforeAdvice implements IAdvice {

	public void exec() {
		System.out.println("I'm before advice.");
	}

}
