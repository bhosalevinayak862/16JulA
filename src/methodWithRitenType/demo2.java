package methodWithRitenType;

public class demo2
{
	public static void main(String[] args) 
	{
		int result=adding(10,20);
	    System.out.println(result);
	    
	    int val=adding(100,200);
	    System.out.println(val);
	    System.out.println("---------");
	    System.out.println(adding(25,35));
	    
	    System.out.println("----------");
	    int val1=adding(45,45);
	     System.out.println(val1);
		
		
		
		
	}
	
	public static int adding(int a,int b)
	{
	int	sum=a+b;
	return sum;
		
	}

}
