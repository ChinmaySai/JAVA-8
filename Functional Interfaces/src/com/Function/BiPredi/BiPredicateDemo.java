package com.Function.BiPredi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		
		BiPredicate<Integer,Integer> isSumEven=(input1,input2) -> (input1+input2)%2==0;
		System.out.println("isSumEven -> "+isSumEven.test(10,85));
		
		
	}

}
