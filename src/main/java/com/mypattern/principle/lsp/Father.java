package com.mypattern.principle.lsp;

import java.util.Collection;
import java.util.HashMap;

public class Father {
	public Collection doSomething(HashMap map) {
		System.out.println("Father was called");
		return map.values();
	}
}
