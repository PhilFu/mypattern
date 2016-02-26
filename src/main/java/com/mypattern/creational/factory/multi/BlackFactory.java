package com.mypattern.creational.factory.multi;

import com.mypattern.creational.factory.BlackHuman;
import com.mypattern.creational.factory.Human;

public class BlackFactory extends HumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
