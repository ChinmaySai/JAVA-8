package com.chinmay.methodreferences;

@FunctionalInterface
public interface ProductInterface {

	//THis Functional interface is created to create an Object of Product class
	public Product getProduct(String name,int price);
}
