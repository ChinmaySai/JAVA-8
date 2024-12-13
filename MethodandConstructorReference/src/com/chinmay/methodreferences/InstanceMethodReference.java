package com.chinmay.methodreferences;
import java.lang.System;

public class InstanceMethodReference {

	public static void main(String[] args) {

		
		
		InstanceMethodReference instanceMethodReference=new InstanceMethodReference();
		//Static Method reference
		ArithmeticOperation op1=instanceMethodReference::performMultiplication;
		System.out.println("Instance Method Reference Multiplication val : "+ op1.performOperation(3,4));
		ArithmeticOperation op2=instanceMethodReference::performAdditon;
		System.out.println("Instance Method Reference Addition val : "+ op2.performOperation(3,4));
		
	}
	public int performMultiplication(int a,int b)
	{
		return a*b;
		
	}

	public int performAdditon(int a,int b)
	{
		return a+b;
		
	}

}
