package com.gorkuelo.java8poc.examples.defaultMethodsPOC;

public class DefaultMethodsPOC implements Dog1, Dog2{

	public static void main(String[] args) {
		DefaultMethodsPOC defaultMethodsPOC = new DefaultMethodsPOC();
		defaultMethodsPOC.walk();
		defaultMethodsPOC.bark();

	}

	@Override
	public void walk() {
		System.out.println("Dog walks");
		
	}

	@Override
	public void bark() {
		// Change Dog1 to select other interface default method (bark).
		Dog1.super.bark();
	}

}
