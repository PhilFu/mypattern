package com.mypattern.structural.proxy.character;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer player = null;

	public GamePlayerProxy() {
		if (this.player == null) {
			this.player = new GamePlayer("zhangsan");
		}
	}

	public void count() {
		System.out.println("count 50$.");
	}

	public void login(String user, String pwd) {
		this.player.login(user, pwd);
	}

	public void killBoss() {
		this.player.killBoss();
	}

	public void upgrade() {
		this.player.upgrade();
		this.count();
	}

}
