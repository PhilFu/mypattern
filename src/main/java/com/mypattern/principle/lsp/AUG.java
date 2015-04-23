package com.mypattern.principle.lsp;

public class AUG extends Rifle {
	public void zoomOut() {
		System.out.println("Zoomout to watch enemy!");
	}

	@Override
	public void shoot() {
		System.out.println("AUG shoot!");
	}
}
