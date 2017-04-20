package com.gorkuelo.java8poc.examples.defaultMethodsPOC;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import junit.framework.TestCase;

public class DefaultMethodsPOCTest extends TestCase{
	
	public DefaultMethodsPOC defaultMethodsPOC = new DefaultMethodsPOC();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Test
	public void test() {
		setUpStreams();
		defaultMethodsPOC.bark();
		assertEquals("Dog1 barks", outContent.toString());
	}
	
	private void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

}
