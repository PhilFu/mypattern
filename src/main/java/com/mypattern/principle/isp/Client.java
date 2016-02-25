package com.mypattern.principle.isp;

public class Client {

	public static void main(String[] args) {
		IPrettyGirl yanYan = new PrettyGirl("Yan Yan");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
