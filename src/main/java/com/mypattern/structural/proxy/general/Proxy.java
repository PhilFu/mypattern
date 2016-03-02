package com.mypattern.structural.proxy.general;

public class Proxy implements Subject {
	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {

	}

	private void after() {

	}

}
