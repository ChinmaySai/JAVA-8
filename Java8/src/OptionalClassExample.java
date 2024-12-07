import java.util.*;
public class OptionalClassExample {
	
	public static void main(String args[])
	{
		
		String str[]=new String[10];
		str[5]="Chinmay Sai";
		Optional<String> op=Optional.empty(); ///It returns an Empty Optional instance
		System.out.println(op);
		
		Optional<String> op1=Optional.of("Chinmay");//We will use when we are sure that the value will be present.
		System.out.println(op1.get());
		System.out.println(op1.isPresent());
		
		Optional<String> op2=Optional.ofNullable(str[4]); //If we are not sure whether value will be present or not we can go with the OfNullable
		System.out.println(op2.isPresent()); //Returns a Boolean value whether the value is present or not
		op2.ifPresent(System.out::println);
		System.out.println(op2.orElse("No value"));
		
		Optional<Optional<String>> op3=Optional.of(Optional.of(str[5]));
		Optional<String> op4=Optional.empty();
		
		System.out.println("Optional.map: " + op3.map(input -> input.map(String::toUpperCase)));
		System.out
				.println("Optional.flatMap: " + op3.flatMap(input -> input.map(String::toUpperCase)));//It will Wrap into Single layer only

		Optional<String> country = Optional.of("INDIA");
		Optional<String> emptyCountry = Optional.empty();
		
		System.out.println(country.filter(g -> g.equals("india"))); // Optional.empty
		System.out.println(country.filter(g -> g.equalsIgnoreCase("INDIA"))); // Optional[INDIA]
		System.out.println(emptyCountry.filter(g -> g.equalsIgnoreCase("INDIA"))); // Optional.empty

		if (country.isPresent()) {
			System.out.println("Value available");
		}
		
		country.ifPresent(c -> System.out.println("In Country Option, value available is:" + c));

		// condition failed, no output will be printed
		emptyCountry.ifPresent(c -> System.out.println("In Empty Country Option, value available is:" + c));

		System.out.println(country.orElse("No Country data available"));
		System.out.println(emptyCountry.orElse("No Country data available"));
		System.out.println(emptyCountry.orElseGet(()->"No Country data available"));
		//System.out.println(emptyCountry.orElseThrow(NoSuchElementException::new));
		
		
		
	}
	

}
