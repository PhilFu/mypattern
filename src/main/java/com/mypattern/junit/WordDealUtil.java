package com.mypattern.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDealUtil {
	public static String wordFormat4DB(String name) {
		if (name == null) {
			return null;
		}
		Pattern p = Pattern.compile("[A-Z]");
		Matcher matcher = p.matcher(name);
		StringBuffer sb = new StringBuffer();

		while (matcher.find()) {
			if (matcher.start() != 0) {
				matcher.appendReplacement(sb, "_" + matcher.group());
			}
		}
		return matcher.appendTail(sb).toString().toLowerCase();
	}
}
