package com.mypattern.structural.proxy.force;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("zhangsan");
		IGamePlayer proxy = player.getProxy();
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}

}
