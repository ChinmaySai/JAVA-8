package com.Function.Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String args[])
	{
		Supplier<Integer> month=() -> LocalDate.now().getMonthValue();
		System.out.println("Current Month of the Year : "+month.get());
		Supplier<Integer> day=() -> LocalDate.now().getDayOfYear();
		System.out.println("Current Day of the Year : "+day.get());
		Supplier<Integer> dayofMonth=() -> LocalDate.now().getDayOfMonth();
		System.out.println("Current Day of the Month : "+dayofMonth.get());
		
		Supplier<String> dayofWeek=() -> LocalDate.now().getDayOfWeek().name();
		System.out.println("Current Day of the Week : "+dayofWeek.get());


		
		
	}
}
