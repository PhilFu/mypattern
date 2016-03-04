package com.mypattern.behavioral.mediator.after;

public class Stock extends Colleague {
	private static int COMPUTER_NUMBER = 100;

	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("Stock number: " + number);
	}

	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("Stock number: " + number);
	}

	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	public void clearStock() {
		System.out.println("Stock number: " + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
