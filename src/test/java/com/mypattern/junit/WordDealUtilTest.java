package com.mypattern.junit;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordDealUtilTest {
	@Test
	public void wordFormat4DBNormal() {
		String target = "employeeInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, is("employee_info"));
	}
	
	@Test
	public void wordFormat4DBNull() { 
		String target = null;
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, nullValue());
	}
	
	@Test
	public void wordFormat4DBEmpty() {
		String target = "";
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, isEmptyString());
	}
	
	@Test
	public void wordFormat4DBegin() {
		String target = "EmployeeInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, is("employee_info"));
	}
	
	@Test
	public void wordFormat4DBEnd() {
		String target = "employeeInfoA";
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, is("employee_info_a"));
	}
	
	@Test
	public void wordFormat4DBTogether() {
		String target = "employeeAInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertThat(result, is("employee_a_info"));
	}
	
	@Test
	public void testAsserThat() {
		int testNumber = 10;
		assertThat(testNumber, greaterThan(4));
		assertThat(testNumber, lessThan(12));
		assertThat(testNumber, allOf(greaterThan(8), lessThan(16)));
		assertThat(testNumber, anyOf(greaterThan(8), lessThan(9)));
		assertThat(testNumber, anything());
		
		String testString = "developer";
		assertThat(testString, is("developer"));
		assertThat(testString, not("develop"));
		assertThat(testString, containsString("develop"));
		assertThat(testString, endsWith("er"));
		assertThat(testString, startsWith("de"));
		assertThat(testString, equalTo("developer"));
		assertThat(testString, equalToIgnoringCase("Developer"));
		assertThat(testString, equalToIgnoringWhiteSpace("developer "));
		
		double testDouble = 20.2;
		assertThat(testDouble, closeTo(20.0, 0.5));
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
		map.put("test", "test");
		assertThat(map, hasEntry("key", "value"));
		assertThat(map, hasKey("key"));
		assertThat(map, hasValue("value"));
	}
}
