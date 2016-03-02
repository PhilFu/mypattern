package com.mypattern.structural.proxy.character;

public class GamePlayer implements IGamePlayer {
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	public void login(String user, String pwd) {
		System.out.println(this.name + " logined, his account is: " + user);
	}

	public void killBoss() {
		System.out.println(this.name + " killed a boss.");
	}

	public void upgrade() {
		System.out.println(this.name + " level up");
	}

}
