package com.gorkuelo.java8poc.examples.lambdaPOC;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class LambdaPOCTest extends TestCase {
	private final String STRING1 = "A1";
	private final String STRING2 = "B1";
	private final String STRING3 = "C1";
	private final String STRING4 = "D1";
	private final double NUM1 = 4;
	private final double NUM2 = 7;
	private final double RESULT_EXPECTED_AVERAGE = 5.5;
	private final double RESULT_EXPECTED_MULTIPLY = 28;
	private final double RESULT_EXPECTED_ADD = 11;
	private final double RESULT_EXPECTED_WITHOUT_PARAMS = 4;
	private LambdaPOC lambdaPOC = new LambdaPOC();
	
	
	@Test
	public void testSortList(){
		List<String> listString = mockedListString();
		lambdaPOC.sortList(listString);
		assertEquals(listString.get(0), STRING1);
		assertEquals(listString.get(1), STRING2);
		assertEquals(listString.get(2), STRING3);
		assertEquals(listString.get(3), STRING4);
	}
	
	@Test
	public void testAverage(){
		double result = lambdaPOC.average(NUM1, NUM2);
		assertEquals(result, RESULT_EXPECTED_AVERAGE);
	}
	
	@Test
	public void testMultiply(){
		double result = lambdaPOC.multiply(NUM1, NUM2);
		assertEquals(result, RESULT_EXPECTED_MULTIPLY);
	}
	
	@Test
	public void testCodeIntoLambdaAdd(){
		double result = lambdaPOC.codeIntoLambdaAdd(NUM1, NUM2);
		assertEquals(result, RESULT_EXPECTED_ADD);
	}

	@Test
	public void testOperationWithoutParams(){
		double result = lambdaPOC.operationWithoutParams();
		assertEquals(result, RESULT_EXPECTED_WITHOUT_PARAMS);
	}

	private List<String> mockedListString() {
		List<String> listString = new ArrayList<String>();
		listString.add(STRING4);
		listString.add(STRING2);
		listString.add(STRING1);
		listString.add(STRING3);
		return listString;
	}

}
