package com.mypattern.structural.proxy.force;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	public void login(String username, String pwd) {
		this.gamePlayer.login(username, pwd);
	}

	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	public void upgrade() {
		this.gamePlayer.upgrade();
	}

	public IGamePlayer getProxy() {
		return this;
	}

}
