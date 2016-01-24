package com.mypattern.principle.lsp;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		Soldier sanmao = new Soldier();
		sanmao.setGun(new HandGun());
		sanmao.killEnemy();

		Snipper simao = new Snipper();
		simao.killEnemy(new AUG());

		invoker();
	}

	public static void invoker() {
		// we could use son to instead father anywhere.
		// Father f = new Father();
		Son f = new Son();
		HashMap map = new HashMap();
		f.doSomething(map);
	}
}
