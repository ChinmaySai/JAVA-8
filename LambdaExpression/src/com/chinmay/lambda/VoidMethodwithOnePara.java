package com.chinmay.lambda;

public class VoidMethodwithOnePara {
	
public static void main(String args[])
{
	VoidMethodwithOneParam oneparam=(String input) -> System.out.print(input.toUpperCase()+" ");
	VoidMethodwithOneParam oneparam1=(input) -> System.out.print(input.toUpperCase()+" ");
	VoidMethodwithOneParam oneparam2=(input) -> 
	{
		System.out.println(input.toUpperCase());
	};
	oneparam.print("Chinmay");
	oneparam1.print("Sai");
	oneparam2.print("Java Backend Developer");
	
}
}
