package Exceptionhandling;

public class demo5 
{
	public static void main(String[] args)
	{
		int[] ar=new int[4];
		try
		{
			ar[5]=20;
			
		}
		catch(Exception j)
		{
	           j.printStackTrace();
		}
		
	}

}
