package com.mypattern.principle.isp;

public class Searcher extends AbstractSearcher {

	public Searcher(IPrettyGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	public void show() {
		System.out.println("Pretty girl info:");
		super.prettyGirl.goodLooking();
		super.prettyGirl.niceFigure();
		super.prettyGirl.greatTemperament();
	}

}
