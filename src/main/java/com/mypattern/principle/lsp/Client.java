package com.mypattern.principle.lsp;

public class Client {

	public static void main(String[] args) {
		Soldier sanmao = new Soldier();
		sanmao.setGun(new HandGun());
		sanmao.killEnemy();
	}

}
