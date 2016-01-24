package com.mypattern.principle.lsp;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
	// @Override
	public Collection doSomething(Map map) {
		System.out.println("Son was called");
		return map.values();
	}
}
