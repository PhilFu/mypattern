package com.mypattern.principle.isp;

public abstract class AbstractSearcher {
	protected IPrettyGirl prettyGirl;

	public AbstractSearcher(IPrettyGirl prettyGirl) {
		this.prettyGirl = prettyGirl;
	}

	public abstract void show();
}
