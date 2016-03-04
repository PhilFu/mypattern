package com.mypattern.behavioral.mediator.after;

public class Purchase extends Colleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void buyIBMComputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	public void refuseBuyIBM() {
		System.out.println("No longer buy IBM.");
	}
}
