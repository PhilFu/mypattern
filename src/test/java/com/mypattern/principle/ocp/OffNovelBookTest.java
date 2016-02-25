package com.mypattern.principle.ocp;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OffNovelBookTest {

	private IBook blow40Book = new OffNovelBook("aaa", 3000, "bbbb");
	private IBook above40Book = new OffNovelBook("cccc", 6000, "dddd");

	@Test
	public void testGetPriceBelow40() {
		assertThat(blow40Book.getPrice(), is(2400));
		assertThat(above40Book.getPrice(), is(5400));
	}
}
