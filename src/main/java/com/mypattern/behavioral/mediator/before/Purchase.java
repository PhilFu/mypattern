package com.mypattern.behavioral.mediator.before;

public class Purchase {
	public void buyIBMComputer(int number) {
		Stock stock = new Stock();
		Sale sale = new Sale();
		int status = sale.getSaleStatus();
		if (status > 80) {
			System.out.println("Purchase computer, number: " + number);
			stock.increate(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("Purchase computer, number: " + buyNumber);
			stock.increate(buyNumber);
		}
	}

	public void refuseBuyIBM() {
		System.out.println("No longer buy IBM computer.");
	}
}
