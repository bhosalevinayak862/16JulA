package methodWithRitenType;

public class demo5
{
	public static void main(String[] args) 
	{
		demo5 s1=new demo5();
	
      int adder= s1.add(10,20);
      System.out.println(adder);
      
      int add1=s1.add(50, 75);
      System.out.println(add1);
      
      System.out.println("-----------");
      System.out.println(s1.add(200, 400));
      System.out.println("------------");
      System.out.println(adder+add1);
      System.out.println("------------");
      System.out.println(adder*add1);
      
      
      
	}
       
	public int add(int a,int b)
{
	int sum=a+b;
	return sum;
	
	
	
	
	
	}
}

	

	
