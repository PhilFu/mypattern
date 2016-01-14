package com.mypattern.principle.srp;

/**
 * Contains too much function
 * logic calculation -- calculatePay
 * database logic -- save
 * reports logic -- describEmployee
 * If any of them change, we need to change this class
 * @author DeBen
 *
 */
public class Employee {
	public double calculatePay() {
		return 1.0;
	}

	public void save() {
	}

	public String describEmployee() {
		return "";
	}
}
