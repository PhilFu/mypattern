package com.mypattern.behavioral.mediator.before;

import java.util.Random;

public class Sale {
	public void saleIBMComputer(int number) {
		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStock() < number) {
			purchase.buyIBMComputer(number);
		}
		System.out.println("Sale computer number: " + number);
		stock.decrease(number);
	}

	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("Sale status: " + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		Stock stock = new Stock();
		System.out.println("Half price sell: " + stock.getStock());
	}
}
