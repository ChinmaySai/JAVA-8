import java.util.function.Function;
public class FunctionFunctionalLamda {

	public static void main(String[] args) {
		

		Function<String,Integer> fun= name ->name.length();
		System.out.println("Lenght of String "+fun.apply("Chinmay"));
	}
}
