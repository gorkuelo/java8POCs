package com.gorkuelo.java8poc.examples.functionalinterface;

import org.junit.Test;

import junit.framework.TestCase;

public class FunctionalInterfacePOCTest extends TestCase{
	
	private FunctionalInterfacePOC functionalInterfacePOC = new FunctionalInterfacePOC();
	private final double NUM1 = 7;
	private final double NUM2 = 9;
	private final double RESULT_EXPECTED_AVERAGE = 8;
	

	@Test
	public void testAverage() {
		double result = functionalInterfacePOC.average(NUM1, NUM2);
		assertEquals(result, RESULT_EXPECTED_AVERAGE);
	}

}
