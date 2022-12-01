package methodWithRitenType;

public class demo1
{
	public static void main(String[] args)
	{
	   int sum=add(10,20);
	   System.out.println(sum);
	   
	   int sum2=add(100,200);
	   System.out.println(sum2);
	   System.out.println("-------------");
	   
	   System.out.println(add(50,50));
	   
	   
		
	}
	
	public static int add(int a,int b)
	{
		int num1=a+b;
		 return num1;
		
	}

}
