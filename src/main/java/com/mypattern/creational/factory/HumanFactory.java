package com.mypattern.creational.factory;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> Human createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("Human generate failed.");
		}
		return human;
	}

}
