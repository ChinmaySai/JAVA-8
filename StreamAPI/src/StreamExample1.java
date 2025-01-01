import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		
		List<String> department=new ArrayList<>();
		department.add("Supply");
		department.add("HR");
		department.add("Sales");
		department.add("Marketing");
		Stream<String> dep=department.stream();
		dep.forEach(depart ->System.out.println(depart));
		System.out.println();
		Stream<String> newStream=Stream.of("Chinmay","Java 8");//These elements will be internally Stored in Array
	     newStream.forEach(System.out::println);
	    System.out.println();
	     System.out.println("Paraller Stream Output : ");
	    Stream<String> parallelStream=department.parallelStream();
	    parallelStream.forEach(System.out::println);

	}

}
