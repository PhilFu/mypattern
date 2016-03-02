package com.mypattern.structural.proxy.character;

public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy();

		proxy.login("user", "123");
		proxy.killBoss();
		proxy.upgrade();
	}

}
