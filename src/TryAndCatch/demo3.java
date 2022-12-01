package TryAndCatch;

public class demo3 
{
	public static void main(String[] args) 
	{
		int [] asr=new int[4];
		
		try
		{
			asr[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException j)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		System.out.println("Hii.....");
		System.out.println("Good morning");
		
	}

}
