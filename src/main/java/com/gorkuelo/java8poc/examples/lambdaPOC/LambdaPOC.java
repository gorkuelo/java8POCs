package com.gorkuelo.java8poc.examples.lambdaPOC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaPOC {

	public void sortList(List<String> listString){
		Collections.sort(listString, (String s1, String s2) -> s1.compareTo(s2));
		printSortedList(listString);
	}
	
	public double average(double num1, double num2){
		Operations operations = (double x, double y) -> (x+y)/2;
		return operations.operation(num1, num2);
	}

	public double multiply(double num1, double num2){
		Operations operations = (double x, double y) -> x * y;
		return operations.operation(num1, num2);
	}

	
	public static void main(String[] args) {
		LambdaPOC lambdaPOC = new LambdaPOC();
		lambdaPOC.sortList(lambdaPOC.mockListString());
		System.out.println("Average: " + lambdaPOC.average(2, 1));
		System.out.println("Multiply: " + lambdaPOC.multiply(2, 7));
	}

	

	public List<String> mockListString() {
		List<String> result = new ArrayList<String>();
		result.add("Hola");
		result.add("Adios");
		result.add("Ciao");
		result.add("Hello");
		return result;
	}
	
	private void printSortedList(List<String> listString) {
		for (String element: listString){
			System.out.println(element);
		}
	}
}
