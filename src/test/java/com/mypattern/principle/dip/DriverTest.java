package com.mypattern.principle.dip;

import mockit.*;

import org.junit.Test;

public class DriverTest {

	@Mocked
	ICar car;

	@Test
	public void testDrive() {
		car.run();
		
		new Verifications() {{
			car.run();
			times = 1;
		}
		};
	}
}
