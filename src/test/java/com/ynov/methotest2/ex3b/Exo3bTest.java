package com.ynov.methotest2.ex3b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ynov.methotest2.ex3.Exo3;

@SpringBootTest
public class Exo3bTest {
	
	@Test
	public void testOneLine() {
		assertEquals("One line", new Exo3b().format("One line", 100, 50));
	}
	
	@Test
	public void testOneNewLine() {
		assertEquals("One new\nline", new Exo3b().format("One new line", 7, 50));
	}
	
	@Test
	public void testToLongWord() {
		assertEquals("anticonstitutionnel-\nlement", new Exo3b().format("anticonstitutionnellement", 20, 50));
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
				new Exo3b().format(
						"J’aimerai découper cette ligne:\n"
						+ "Cette ligne est beaucoup trop longue alors je souhaite la découper.", 20, 50));
	}
	
	@Test
	public void testSeveralLineWithCut() {
		assertEquals("J’aimerai découper\n"
				+ "cette ligne:\n"
				+ "Cette ligne est bea-\n"
				+ "ucoup trop longue\n"
				+ "alors je souhaite la\n"
				+ "découper.", 
				new Exo3b().format(
						"J’aimerai découper cette ligne:\n"
						+ "Cette ligne est beaucoup trop longue alors je souhaite la découper.", 20, 7));
	}
	
}
