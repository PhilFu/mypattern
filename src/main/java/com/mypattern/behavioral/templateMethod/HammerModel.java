package com.mypattern.behavioral.templateMethod;

public abstract class HammerModel {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	public final void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	};
}
