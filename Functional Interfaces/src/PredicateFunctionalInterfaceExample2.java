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
      System.out.println("Elements greater than 10 and divisible by 2");
      m1(p1.and(p2),a);
      System.out.println("Elements greater than 10 or divisible by 2");
      m1(p1.or(p2),a);
      System.out.println("Elements which are odd");
      m1(p2.negate(),a);
      
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
