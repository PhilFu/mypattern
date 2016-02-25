package com.mypattern.principle.ocp;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NovelBookTest {

	private IBook book;

	@Before
	public void init() {
		book = new NovelBook("aaaa", 6000, "bbb");
	}

	@Test
	public void testGetPrice() {
		assertThat(book.getPrice(), is(6000));
	}
}
