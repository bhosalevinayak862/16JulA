package Exceptionhandling;

public class demo2 
{
	public static void main(String[] args) 
	{
		String str="Vinayak";
		
		System.out.println(str.length());
		try
		{
			System.out.println(str.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBondaryIndex");
		}
		System.out.println(str.charAt(0));
		
	}

}
