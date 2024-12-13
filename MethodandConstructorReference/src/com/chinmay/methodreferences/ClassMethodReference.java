package com.chinmay.methodreferences;

import java.util.List;

public class ClassMethodReference {
	
	public static void main(String args[])
	{
		
		var list=List.of("HR","Supply","Sales","Marketing");
		list.forEach(department ->System.out.println(department));
		System.out.println("Below output is printed with class Method reference");
		list.forEach(System.out::println);//It is basically like For Consumer Functional 
		                                   //interface we have given println() code functionality and for that println method
		                                  //we gave list as input.
	}

}
