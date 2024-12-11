package com.Function.BinaryOpe;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Double> calPow=(base,pow) ->Math.pow(base,pow);
		System.out.println(calPow.apply(2.0,3.0));
		
		BinaryOperator<Integer> max=BinaryOperator.maxBy((a,b) ->Integer.compare(a,b));
		System.out.println(max.apply(16, 30));
		
		BinaryOperator<Integer> minVal=BinaryOperator.minBy((a,b) ->Integer.compare(a,b));
		System.out.println(minVal.apply(16, 30));
	}

}
