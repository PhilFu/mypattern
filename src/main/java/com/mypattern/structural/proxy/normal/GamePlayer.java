package com.mypattern.structural.proxy.normal;

public class GamePlayer implements IGamePlayer {
	private String name = "";

	public GamePlayer(IGamePlayer player, String name) throws Exception {
		if (player == null) {
			throw new Exception("Cann't create real player.");
		} else {
			this.name = name;
		}
	}

	public void login(String user, String pwd) {
		System.out.println(this.name + " logined.");
	}

	public void killBoss() {
		System.out.println(this.name + " kill boss.");
	}

	public void upgrade() {
		System.out.println(this.name + " level up.");
	}

}
