package com.mypattern.structural.proxy;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer player;

	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	public void login(String user, String pwd) {
		this.player.login(user, pwd);
	}

	public void killBoss() {
		this.player.killBoss();
	}

	public void upgrade() {
		this.player.upgrade();
	}

}
