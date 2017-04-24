package com.gorkuelo.java8poc.examples.lambdaWithCollections;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollectionsPOC {
	
	public List<String> forEachExample(){
		List<String> listString = getMockedListString();
		List<String> result = new ArrayList<String>();
		listString.forEach(x -> result.add(x + "."));
		return result;
	}
	
	private List<String> getMockedListString() {
		List<String> result = new ArrayList<String>();
		result.add("Hola");
		result.add("Adios");
		result.add("Ey");
		result.add("Ciao");
		return result;
	}

	public static void main(String[] args) {
		LambdaWithCollectionsPOC lambdaWithCollectionsPOC = new LambdaWithCollectionsPOC();
		lambdaWithCollectionsPOC.forEachExample();

	}

}
