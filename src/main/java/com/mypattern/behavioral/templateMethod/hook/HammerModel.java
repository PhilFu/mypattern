package com.mypattern.behavioral.templateMethod.hook;

public abstract class HammerModel {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	public void run() {
		this.start();
		this.engineBoom();
		if (this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

	protected boolean isAlarm() {
		return true;
	};
}
