package com.mypattern.behavioral.mediator.before;

public class Client {
	public static void main(String[] args) {
		System.out.println("======================Purchase=================");
		Purchase purchase = new Purchase();
		purchase.buyIBMComputer(100);

		System.out.println("======================Sale====================");
		Sale sale = new Sale();
		sale.saleIBMComputer(1);

		System.out.println("======================Stock====================");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
