package com.mypattern.behavioral.mediator.after;

import java.util.Random;

public class Sale extends Colleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("Sale number: " + number);
	}

	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("Sale status: " + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}
