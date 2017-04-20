package com.gorkuelo.java8poc.examples.defaultMethodsPOC;

public interface Dog2 {
	
	public void walk();

	default public void bark(){
		System.out.print("Dog2 barks");
	};
}
