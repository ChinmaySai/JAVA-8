package com.chinmay.methodreferences;

public class ConstructorMethodReference {

	public static void main(String[] args) {

		ProductInterface pi=(name,price) -> new Product(name,price);
		System.out.println(pi.getProduct("Mobile",10000));          ///This returns a Product Object
		//Rather thann Above we can directly use below way it will also create Object for Product class.
		ProductInterface pi1=Product::new; ///Create an Object for Product and return that Object
	}

}
