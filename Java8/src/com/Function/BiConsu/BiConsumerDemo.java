package com.Function.BiConsu;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String,String> appendConvert=(input1,input2) -> System.out.println((input1+input2).toUpperCase());
		appendConvert.accept("Chinmay Sai"," Java Backend Developer");
		
		BiConsumer<String,String> lenghtOfAppendString=(input1,input2) -> System.out.println("Lenght of Appended String :"+(input1+input2).length());
		lenghtOfAppendString.accept("Chinmay Sai"," Java Backend Developer");
	}

}
