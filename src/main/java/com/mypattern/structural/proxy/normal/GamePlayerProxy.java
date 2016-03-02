package com.mypattern.structural.proxy.normal;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer player = null;

	public GamePlayerProxy(String name) {
		try {
			player = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void login(String user, String pwd) {
		this.player.login("zhangsan", "12w");
	}

	public void killBoss() {
		this.player.killBoss();
	}

	public void upgrade() {
		this.player.upgrade();
	}

}
