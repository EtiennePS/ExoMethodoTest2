package com.ynov.methotest2.ex2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exo2v1Test {
	
	@Test
	public void testIsLeap2000() {
		assertTrue(new Exo2v1().isLeapYear(2000));
	}
}
