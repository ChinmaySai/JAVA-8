package com.Function.BiFun;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		
		BiFunction<Double,Double,Double> calPow=(base,pow) ->Math.pow(base,pow);
		System.out.println(calPow.apply(2.0,3.0));
	}

}
