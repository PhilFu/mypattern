package com.mypattern.structural.proxy;

public class Client {

	public static void main(String[] args) {
		// old
		IGamePlayer player = new GamePlayer("ZhangSan");
		player.login("zhangsan", "123");
		player.killBoss();
		player.upgrade();

		// proxy
		IGamePlayer player2 = new GamePlayerProxy(player);
		player2.login("zhangsan", "222");
		player2.killBoss();
		player2.upgrade();
	}

}
