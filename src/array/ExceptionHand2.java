package array;

public class ExceptionHand2 
{
	public static void main(String[] args) 
	{
		String s1="Vinayak";
		try
		{
			System.out.println(s1.charAt(8));
		}
		catch(StringIndexOutOfBoundsException d)
		{
			System.out.println("String Index Out Of Bondary index handled");
		}
		
		
		System.out.println("Hiii");
		System.out.println("Hellow");
		
	}

}
