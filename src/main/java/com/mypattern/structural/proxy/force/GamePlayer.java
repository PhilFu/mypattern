package com.mypattern.structural.proxy.force;

public class GamePlayer implements IGamePlayer {
	private String name = null;
	private IGamePlayer proxy = null;

	public GamePlayer(String name) {
		this.name = name;
	}

	public void login(String username, String pwd) {
		if (this.isProxy()) {
			System.out.println(name + " logined with " + username);
		} else {
			System.out.println("Please use proxy.");
		}
	}

	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + " kill boss.");
		} else {
			System.out.println("Please use proxy.");
		}
	}

	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + " level up.");
		} else {
			System.out.println("Please use Proxy.");
		}
	}

	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}
}
