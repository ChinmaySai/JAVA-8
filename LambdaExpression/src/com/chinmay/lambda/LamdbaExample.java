package com.chinmay.lambda;

public class LamdbaExample {

      int sum=0;
	public static void main(String[] args) {

		LamdbaExample obj=new LamdbaExample();
		obj.cal();
	}
	public void cal()
	{
		ArithmeticOperations op1=(a,b) ->
		{
			int sum=0;
		    this.sum=a+b;
		    System.out.println("Value of sum in the Lambda Expression "+sum);
			return this.sum;
		};
		System.out.println("Operation value "+op1.sum(50, 6));
	}

}