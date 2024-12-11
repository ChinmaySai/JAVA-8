import java.util.function.Predicate;

class MyPredicateString implements Predicate<String>
{
	@Override
	public boolean test(String name)
	{
		if(name.length()>5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {

		MyPredicateString myp=new MyPredicateString();
		System.out.println(myp.test("Chinmay"));
		System.out.println(myp.test("Sai"));
	}

}
