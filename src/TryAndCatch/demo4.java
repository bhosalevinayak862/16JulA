package TryAndCatch;

public class demo4 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[4];
		
		
		try
		{
			ar[6]=25;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Excep Handled Successfuly");
		}
		System.out.println("Hiii....");
		System.out.println("good Morning");
	}

}
