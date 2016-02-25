package com.mypattern.principle.ocp;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
	private static final List<IBook> bookList = new ArrayList<IBook>();
	static {
		bookList.add(new OffNovelBook("sky dragon eight", 3200, "Jin Yong"));
		bookList.add(new OffNovelBook("Paris", 5600, "Hugo"));
		bookList.add(new OffNovelBook("Sad world", 3500, "Hugo"));
		bookList.add(new OffNovelBook("golden cup", 4300, "smell"));
	}

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("Sell:=============================");
		for (IBook book : bookList) {
			System.out.println("Book name: " + book.getName() + "; Author: "
					+ book.getAuthor() + ";Book price: "
					+ formatter.format(book.getPrice() / 100.0));
		}
	}
}
