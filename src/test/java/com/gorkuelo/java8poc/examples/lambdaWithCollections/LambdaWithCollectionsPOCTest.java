package com.gorkuelo.java8poc.examples.lambdaWithCollections;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LambdaWithCollectionsPOCTest {

	private final LambdaWithCollectionsPOC lambdaWithCollectionsPOC = new LambdaWithCollectionsPOC(); 
	private final String ADIOS = "Adios";
	private final String CIAO = "Ciao";
	private final String EY = "Ey";
	private final String HOLA = "Hola";

	@Test
	public void testForEach() {
		List<String> forEachExample = lambdaWithCollectionsPOC.forEachExample();
		for(String element: forEachExample){
			assertTrue(element.charAt(element.length()-1) == '.');
		}
	}
	
	@Test
	public void testRemoveIf() {
		List<String> removeIfExample = lambdaWithCollectionsPOC.removeIfExample();
		assertEquals(removeIfExample.size(), 3);	
	}
	
	@Test
	public void testSort() {
		List<String> sortExample = lambdaWithCollectionsPOC.sortExample();
		assertEquals(sortExample.get(0), ADIOS);
		assertEquals(sortExample.get(1), CIAO);
		assertEquals(sortExample.get(2), EY);
		assertEquals(sortExample.get(3), HOLA);
	}

}
