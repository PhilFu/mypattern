package com.mypattern.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("zhangsan");
		InvocationHandler handler = new GamePlayerIH(player);
		Class cl = player.getClass();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
				cl.getClassLoader(), cl.getInterfaces(), handler);

		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}

}
