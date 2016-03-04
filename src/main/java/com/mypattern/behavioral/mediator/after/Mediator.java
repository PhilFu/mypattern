package com.mypattern.behavioral.mediator.after;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... obj) {
		switch (str) {
		case "purchase.buy":
			this.buy((Integer) obj[0]);
			break;
		case "sale.sell":
			this.sellComputer((Integer) obj[0]);
			break;
		case "sale.offsell":
			this.offSell();
			break;
		case "stock.clear":
			this.clearStock();
			break;
		default:
			break;
		}
	}

	private void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

	private void offSell() {
		System.out.println("Off sell computer: " + stock.getStockNumber());
	}

	private void sellComputer(Integer integer) {
		if (super.stock.getStockNumber() < integer) {
			super.purchase.buyIBMComputer(integer);
		}
		super.stock.decrease(integer);
	}

	private void buy(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {
			System.out.println("Purchase computer: " + number);
			super.stock.increase(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("Purchase computer: " + number);
			super.stock.increase(buyNumber);
		}
	}

}
