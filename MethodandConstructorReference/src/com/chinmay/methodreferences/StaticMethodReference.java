package com.chinmay.methodreferences;

public class StaticMethodReference {

	public static void main(String[] args) {

		ArithmeticOperation op=(num1,num2) ->{
			int sum=num1+num2;
			return sum;
		};
		
		System.out.println(op.performOperation(6,8));
		
		//Static Method reference
		ArithmeticOperation op1=StaticMethodReference::performMultiplication;
		System.out.println("Static Method Reference Multiplication val :"+ op1.performOperation(3,4));
		
	}
	public static int performMultiplication(int a,int b)
	{
		return a*b;
		
	}

}
