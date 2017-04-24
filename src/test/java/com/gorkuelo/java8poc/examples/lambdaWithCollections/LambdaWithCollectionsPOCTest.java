package com.gorkuelo.java8poc.examples.lambdaWithCollections;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LambdaWithCollectionsPOCTest {

	private final LambdaWithCollectionsPOC lambdaWithCollectionsPOC = new LambdaWithCollectionsPOC(); 
	
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

}
