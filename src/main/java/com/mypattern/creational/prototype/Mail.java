package com.mypattern.creational.prototype;

public class Mail implements Cloneable {
	private String receiver;
	private String subject;
	private String applellation;
	private String context;
	private String tail;

	public Mail(AdvTemplate advTemplate) {
		this.context = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getApplellation() {
		return applellation;
	}

	public void setApplellation(String applellation) {
		this.applellation = applellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mail;
	}
}
