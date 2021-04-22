package com.ynov.methotest2.ex2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exo2v3Test {
	
	@Test
	/** Toutes les années divisibles par 400 sont bissextiles */
	public void testIsLeap2000() {
		assertTrue(new Exo2v3().isLeapYear(2000));
	}
	
	@Test
	/** Toutes les années divisibles par 100 mais pas par 400 ne sont pas bissextiles */
	public void testIsNotLeap100() {
		assertFalse(new Exo2v3().isLeapYear(100));
		assertFalse(new Exo2v5().isLeapYear(-600));
	}
}
