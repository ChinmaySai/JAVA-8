import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
      int a[]= {0,5,10,15,20,25,30};
      Predicate<Integer> p1= i ->i>10;
      System.out.println("Elements greater than 10");
      m1(p1,a);
      Predicate<Integer> p2=i->i%2==0;
      System.out.println("Elements divisible by 2");
      m1(p2,a);
      
      
	}
	
	public static void m1(Predicate<Integer> p,int[] x)
	{
		
		for(int element:x)
		{
			if(p.test(element))
			{
				System.out.println(element);
			}
		}
	}

}
