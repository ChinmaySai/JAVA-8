package com.chinmay.lambda;

public class MethodWithTwoParam {

	public static void main(String[] args) {

		 MethodWithTwoParams impl=(a,b) ->  (a+b);
		 MethodWithTwoParams impl1=(a,b) ->  a*b;
		 MethodWithTwoParams impl2=(a,b) ->  {
			 return a-b;
		 };

		 System.out.println("Addition Operation Result "+impl.operation(5, 4));
		 System.out.println("Multiplication Operation Result "+impl1.operation(5, 4));
		 System.out.println("Subtraction Operation Result "+impl2.operation(5, 4));

		 
		
	}

}
