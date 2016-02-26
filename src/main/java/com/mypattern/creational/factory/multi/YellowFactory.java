package com.mypattern.creational.factory.multi;

import com.mypattern.creational.factory.Human;
import com.mypattern.creational.factory.YellowHuman;

public class YellowFactory extends HumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
