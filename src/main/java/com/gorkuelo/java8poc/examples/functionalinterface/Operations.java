package com.gorkuelo.java8poc.examples.functionalinterface;

@FunctionalInterface
public interface Operations {

	double operation(double num1, double num2);
	//FunctionalInterface can't have more than one method.
	//double operationWithoutParams();
}
