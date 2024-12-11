package com.Function.UnaryOper;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String args[])
	{
		UnaryOperator<String> typeConversion=(name) -> name.toUpperCase();
		
		System.out.println(typeConversion.apply("Chinmay Sai"));
		
		
		UnaryOperator<String> identical=UnaryOperator.identity();
		System.out.println(identical.apply("Chinmay"));
		
		UnaryOperator<Integer> doubleValue= num ->num*2;
		UnaryOperator<Integer> tripleValue= num ->num+3;
		
		Function<Integer, Integer> out1=doubleValue.andThen(tripleValue);
		Function<Integer, Integer> out2=doubleValue.compose(tripleValue);
		System.out.println(out1.apply(5)); 
		System.out.println(out2.apply(5));

	}
}
