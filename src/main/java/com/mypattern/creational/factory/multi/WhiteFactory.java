package com.mypattern.creational.factory.multi;

import com.mypattern.creational.factory.Human;
import com.mypattern.creational.factory.WhiteHuman;

public class WhiteFactory extends HumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
