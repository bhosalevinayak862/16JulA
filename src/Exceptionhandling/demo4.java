package Exceptionhandling;

public class demo4 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[2];
		
		try
		{
			ar[3]=10;
		}
		catch(Exception n)
		{
			n.printStackTrace();
		}
		System.out.println("Good Morning");
		
	}

}
