package com.Function.Functional;

import java.util.function.Function;

public class FunctionFunctionalExample {

	public static void main(String args[])
	{
		Function<String,String> typeConversion=(name) -> name.toUpperCase();
		
		System.out.println(typeConversion.apply("Chinmay Sai"));
		
		Function<String,Integer> lenString=(name) -> name.length();
		System.out.println(lenString.apply("Chinmay Sai"));
		
		Function<String,String> identical=Function.identity();
		System.out.println(identical.apply("Chinmay"));
		
		Function<Integer,Integer> doubleValue= num ->num*2;
		Function<Integer,Integer> tripleValue= num ->num+3;
		
		Function<Integer,Integer> out1=doubleValue.andThen(tripleValue);
		Function<Integer,Integer> out2=doubleValue.compose(tripleValue);
		System.out.println(out1.apply(5)); 
		System.out.println(out2.apply(5));

	}
}
