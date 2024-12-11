import java.util.function.Function;

//Lenght of the String 

class MyFunction implements Function<String,Integer>
{

	@Override
	public Integer apply(String t) {
		return t.length();
		
	}
	
}
public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		
      MyFunction f1=new MyFunction();
      System.out.println(f1.apply("Chinmay"));
		
	}

}
