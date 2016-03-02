package com.mypattern.structural.proxy.normal;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayerProxy("zhangsan");
		player.login("zhangsan", "123");
		player.killBoss();
		player.upgrade();
	}

}
