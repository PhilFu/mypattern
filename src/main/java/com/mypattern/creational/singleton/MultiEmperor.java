package com.mypattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiEmperor {
	private static int maxNumOfEmperor = 2;
	private static List<String> nameList = new ArrayList<String>();
	private static List<MultiEmperor> emperorList = new ArrayList<MultiEmperor>();

	private static int countNumOfEmperor = 0;

	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new MultiEmperor("Emperor" + i));
		}
	}

	private MultiEmperor() {

	}

	private MultiEmperor(String name) {
		nameList.add(name);
	}

	public static MultiEmperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}

	public static void main(String[] args) {
		int minsterNum = 5;
		for (int i = 0; i < 5; i++) {
			MultiEmperor emperor = MultiEmperor.getInstance();
			System.out.print("I" + (i + 1) + " ask for ");
			emperor.say();
			System.out.println();
		}
	}
}
