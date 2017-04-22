package com.gorkuelo.java8poc.examples.functionalinterface;

import com.gorkuelo.java8poc.examples.functionalinterface.Operations;

public class FunctionalInterfacePOC {
	
	public double average(double num1, double num2){
		Operations operations = (double x, double y) -> (x+y)/2;
		return operations.operation(num1, num2);
	}

	
	public static void main(String[] args){
		FunctionalInterfacePOC functionalInterfacePOC = new FunctionalInterfacePOC();
		functionalInterfacePOC.average(4, 8);
	}

}
