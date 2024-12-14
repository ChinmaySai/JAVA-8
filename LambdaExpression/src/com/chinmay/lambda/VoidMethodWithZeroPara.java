package com.chinmay.lambda;

public class VoidMethodWithZeroPara {

	public static void main(String[] args) {

		VoidMethodWithZeroParam method=() ->{
			
			System.out.println("Method with no return values and input params");
			};
			VoidMethodWithZeroParam method1=() ->System.out.println("Removed the {} as we have only one line");
			method.printHello();
			method1.printHello();
			
	}

}
