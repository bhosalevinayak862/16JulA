package TryAndCatch;

public class demo2 
{
	public static void main(String[] args) 
	{
		
		int [] asd=new int[6];
		
		
		
		try
		{
			asd[9]=10;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Hi....");
		System.out.println("Good Morning");
		
	}

}
