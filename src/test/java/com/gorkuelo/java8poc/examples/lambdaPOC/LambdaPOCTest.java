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
	
	
	@Test
	public void testSortList(){
		LambdaPOC lambdaPOC = new LambdaPOC();
		List<String> listString = mockedListString();
		lambdaPOC.sortList(listString);
		assertEquals(listString.get(0), STRING1);
		assertEquals(listString.get(1), STRING2);
		assertEquals(listString.get(2), STRING3);
		assertEquals(listString.get(3), STRING4);
		
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
