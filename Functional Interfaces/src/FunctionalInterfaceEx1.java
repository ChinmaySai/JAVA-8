import java.util.function.Predicate;


class MyPredicate implements Predicate<Integer>
{

	
	@Override
	public boolean test(Integer t) {
        if(t>10)
        	return true;
        else
        	return false;
	}
	
}

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {

		MyPredicate p=new MyPredicate();
		System.out.println(p.test(10));
	}

}
