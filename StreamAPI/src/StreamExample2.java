import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		String []arr={"Chinmay","Sai"};
		Stream<String> arrStream=Arrays.stream(arr);

		Stream<String> emptyStream=Stream.empty();
		
		//For generating infinite Stream of Elements
		//Commenting the lines as they would not terminate
		//Stream.generate(new Random()::nextInt).forEach(System.out::println);
		//Stream.iterate(1,n->n+1).forEach(System.out::println);
	}

}
