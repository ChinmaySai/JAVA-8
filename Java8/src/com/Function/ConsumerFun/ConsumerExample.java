package com.Function.ConsumerFun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> op= (name) ->System.out.println("Upper Case of the given String "+name.toUpperCase());
		
		op.accept("Chinmay Sai");
		
		Consumer<Integer> op1= (input) ->System.out.println("Square of the Number "+(input)+"->"+(input*input));
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,6);
		numberList.forEach(op1);
		
		Consumer<String> appendString=(name) ->System.out.println("Name :"+name);
		
		appendString.andThen(op).accept("Chinmay Sai");

	}

}
