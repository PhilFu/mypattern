package com.mypattern.structural.proxy.force;

public interface IGamePlayer {
	public void login(String username, String pwd);

	public void killBoss();

	public void upgrade();

	public IGamePlayer getProxy();
}
