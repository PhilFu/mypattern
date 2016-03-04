package com.mypattern.behavioral.mediator.before;

public class Stock {
	private static int COMPUTER_NUMBER = 100;

	public void increate(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("Stock number: " + COMPUTER_NUMBER);
	}

	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("Stock number: " + COMPUTER_NUMBER);
	}

	public int getStock() {
		return COMPUTER_NUMBER;
	}

	public void clearStock() {
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("Computer number: " + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBuyIBM();
	}
}
