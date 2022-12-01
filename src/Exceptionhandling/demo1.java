package Exceptionhandling;

public class demo1
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		System.out.println("Good Morning");
		
		try
		{
			ar[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		
		
	    System.out.println("Hii");
		
		
	}

}
