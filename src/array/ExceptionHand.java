package array;

public class ExceptionHand 
{
	public static void main(String[] args)
	{
		int [] ar=new int[3];
		
		
		try
		{
			ar[4]=10;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayindexoutOfBondsException");
		}
		
		System.out.println("Hii");
		System.out.println("Hellow");
		
	}

}
