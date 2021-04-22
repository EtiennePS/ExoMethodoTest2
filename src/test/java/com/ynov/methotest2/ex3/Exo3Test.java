package com.ynov.methotest2.ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exo3Test {
	
	@Test
	public void testOneLine() {
		assertEquals("One line", new Exo3().format("One line", 100));
	}
	
	@Test
	public void testOneNewLine() {
		assertEquals("One new\nline", new Exo3().format("One new line", 7));
	}
	
	@Test
	public void testToLongWord() {
		assertThrows(RuntimeException.class, () -> { new Exo3().format("anticonstitutionnellement", 10); });
	}
	
	@Test
	public void testContainsNewline() {
		assertEquals("One new\nline", new Exo3().format("One new\nline", 7));
	}
	
	@Test
	public void testSeveralLine() {
		assertEquals("J’aimerai découper\n"
				+ "cette ligne:\n"
				+ "Cette ligne est\n"
				+ "beaucoup trop longue\n"
				+ "alors je souhaite la\n"
				+ "découper.", 
				new Exo3().format(
						"J’aimerai découper cette ligne:\n"
						+ "Cette ligne est beaucoup trop longue alors je souhaite la découper.", 20));
	}
}
