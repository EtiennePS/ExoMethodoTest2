package com.ynov.methotest2.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exo1Test {
	
	@Test
	public void testHelloWorld() {
		assertEquals("Hello World", new Exo1().concatenate(" ", "Hello", "World"));
	}
	
	@Test
	public void testArcEnCiel() {
		assertEquals("arc-en-ciel", new Exo1().concatenate("-", "arc", "en", "ciel"));
	}
	
	@Test
	public void testNoWord() {
		assertEquals("", new Exo1().concatenate("SEPARATOR"));
	}
	
	@Test
	public void testEmptySep() {
		assertEquals("TestEmptySep", new Exo1().concatenate("", "Test", "Empty", "Sep"));
	}
	
	@Test
	public void testEmptyWords() {
		assertEquals("*****", new Exo1().concatenate("*", "", "", "", "", "", ""));
	}
	
	@Test
	public void testEmptyWordAndSep() {
		assertEquals("", new Exo1().concatenate("", "", "", ""));
	}
	
	@Test
	public void testNullSep() {
		assertThrows(RuntimeException.class, () -> { new Exo1().concatenate(null, "Null", "Sep"); });
	}
	
	@Test
	public void testNullWord() {
		assertThrows(RuntimeException.class, () -> { new Exo1().concatenate("", "Null", "Word", null); });
	}
	
	@Test
	public void testNullWordAndSep() {
		assertThrows(RuntimeException.class, () -> { new Exo1().concatenate(null, "Null", "Word", "And", "Sep", null); });
	}
	
	/************ SUM *************/
	
	@Test
	public void test0And0() {
		assertEquals(0, new Exo1().sum(0, 0));
	}
	
	@Test
	public void test1And1() {
		assertEquals(2, new Exo1().sum(1, 1));
	}
	
	@Test
	public void test1AndNeg1() {
		assertEquals(0, new Exo1().sum(1, -1));
	}
	
	@Test
	public void testMin() {
		assertEquals(Integer.MIN_VALUE, new Exo1().sum(Integer.MIN_VALUE + 1, -1));
	}
	
	@Test
	public void testMax() {
		assertEquals(Integer.MAX_VALUE, new Exo1().sum(Integer.MAX_VALUE - 1, 1));
	}
}
