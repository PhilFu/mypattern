package com.mypattern.junit;

import org.junit.Test;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class MyObjectTest {
	
	@Mocked
	MyObject obj;
	
	@Test
	public void testHello(){
		new NonStrictExpectations() {{
			obj.hello("Zhangsan");
			result = "Hello Zhangsan";
		}};
		
		assertThat(obj.hello("Zhangsan"), is("Hello Zhangsan"));
		
		new Verifications() {{
			obj.hello("Zhangsan");
			times = 1;
		}};
	}
}
