package com.gorkuelo.java8poc.examples.lambdaWithCollections;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LambdaWithCollectionsPOCTest {

	private final LambdaWithCollectionsPOC lambdaWithCollectionsPOC = new LambdaWithCollectionsPOC(); 
	
	@Test
	public void test() {
		List<String> forEachExample = lambdaWithCollectionsPOC.forEachExample();
		for(String element: forEachExample){
			assertTrue(element.charAt(element.length()-1) == '.');
		}
	}

}
