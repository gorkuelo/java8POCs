package com.gorkuelo.java8poc.examples.lambdaWithCollections;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollectionsPOC {
	
	private final String HOLA = "Hola";
	
	public List<String> forEachExample(){
		List<String> listString = getMockedListString();
		List<String> result = new ArrayList<String>();
		listString.forEach(x -> result.add(x + "."));
		return result;
	}
	
	public List<String> removeIfExample(){
		List<String> listString = getMockedListString();
		listString.removeIf(x -> x.equalsIgnoreCase(HOLA));
		return listString;
	}
	
	public List<String> sortExample(){
		List<String> listString = getMockedListString();
		listString.sort((x, y) -> x.compareTo(y));
		return listString;
	}
	private List<String> getMockedListString() {
		List<String> result = new ArrayList<String>();
		result.add(HOLA);
		result.add("Adios");
		result.add("Ey");
		result.add("Ciao");
		return result;
	}

	public static void main(String[] args) {
		LambdaWithCollectionsPOC lambdaWithCollectionsPOC = new LambdaWithCollectionsPOC();
		lambdaWithCollectionsPOC.forEachExample();
		lambdaWithCollectionsPOC.removeIfExample();
		lambdaWithCollectionsPOC.sortExample();
		

	}

}
