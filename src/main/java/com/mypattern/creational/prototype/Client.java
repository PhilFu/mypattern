package com.mypattern.creational.prototype;

import java.util.Random;

public class Client {

	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX copy right");
		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setApplellation("Mr./Ms" + getRandString(5));
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)
					+ ".com");
			sendMail(cloneMail);
			i++;
		}
	}

	private static void sendMail(Mail mail) {
		System.out.println("header: " + mail.getSubject() + "\treceiver: "
				+ mail.getReceiver() + "\t...success");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}

}
