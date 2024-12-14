package com.chinmay.lambda;

public class VoidMethodwithTwoPara {

	public static void main(String[] args) {

		VoidMethodwithTwoParam opAdd=(int a,int b) ->
		{
			System.out.println("Addition Operation "+(a+b));
		};
		VoidMethodwithTwoParam opsub=(int a,int b) ->System.out.println("Subtraction Operation "+(a-b));
		VoidMethodwithTwoParam opMul=(a,b) ->System.out.println("Multiplication Operation "+(a-b));

	}

}
