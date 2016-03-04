package com.mypattern.behavioral.mediator.after;

public abstract class Colleague {
	protected AbstractMediator mediator;

	public Colleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
