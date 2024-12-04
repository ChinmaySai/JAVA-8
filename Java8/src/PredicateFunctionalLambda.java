import java.util.function.Predicate;

public class PredicateFunctionalLambda {

	public static void main(String[] args) {
     
		Predicate<Integer> p= i->i>10;
		System.out.println(p.test(10));
		System.out.println(p.test(20));
		
		Predicate<String> p1=(name)-> name.length()>3;
		System.out.println(p1.test("Chinmay"));
		System.out.println(p1.test("Sai"));
	}

}
