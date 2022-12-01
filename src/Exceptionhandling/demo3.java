package Exceptionhandling;

public class demo3 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int [] ar=new int[2];
		
	 
		 try
		 {
			 System.out.println(a/b);
			 ar[3]=10;
		 }
		 catch(ArithmeticException r)
		 {
			 System.out.println("ArithmeticException Handled");
		 }
		 catch(Exception m)
		 {
			 m.printStackTrace();
		 }
		 System.out.println("Good Morning");
		
	}

}
