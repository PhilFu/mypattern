package com.mypattern.principle.lsp;

public class Soldier {
	public AbstractGun gun;

	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}

	public void killEnemy() {
		System.out.println("Begin to kill enemy!");
		gun.shoot();
	}
}
