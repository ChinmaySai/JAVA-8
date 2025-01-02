import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapOperationsExample {

	public static void main(String[] args) {
		List<String> department=new ArrayList<>();
		department.add("Supply");
		department.add("HR");
		department.add("Sales");
		department.add("Marketing");
		//Stream<String> dep=department.stream();
		System.out.println("Department List : \n");
		department.stream().map(text->text.toUpperCase()).forEach(System.out::println);
		System.out.println();
		System.out.println("Second Usage of map method of Stream API \n");
		department.stream().map(text->text.toUpperCase()).map(text->"Department - > "+text).forEach(System.out::println);

		System.out.println("Second Usage of map method of Stream API \n");
		department.stream().map(text->text.toUpperCase()).map(text->"Department - > "+text).forEach(System.out::println);
		System.out.println("Third Usage of map method of Stream API \n");
		department.stream().map(text->text.toLowerCase()).map(text->"Department - > "+text).forEach(System.out::println);

		
		
	}

}
