package com.stream.creation;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {

	public static void main(String[] args) {
		
		//From Collection Object
		List<String> values=List.of("One","Two","Three");
		Stream<String> stream1=values.stream(); 
		
		//Creation from Array of Values
		String names[]= {"One","Two","Third"};
		Stream<String> stream2=Arrays.stream(names);
		stream2.forEach(System.out::println);
		
		//Stream.Of() static  Method 
		Stream<String> stream3=Stream.of("One","Two","Third");
		
          //Creating an Empty Stream
		Stream<String> stream4=Stream.empty();
	}

}
