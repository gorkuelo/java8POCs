package com.gorkuelo.java8poc.examples.defaultMethodsPOC;

public interface Dog1 {
	
	public void walk();

	default public void bark(){
		System.out.print("Dog1 barks");
	};
}
