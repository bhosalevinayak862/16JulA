package TryAndCatch;

public class demo1 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [4];
		
		
		try
		{
			ar[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		System.out.println("Hi");
		System.out.println("Hellow");
		
	}

}
