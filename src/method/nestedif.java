package method;

public class nestedif {
	public static void main(String[]args)
	{   int a=60;
		if (a>=70)
		{
			System.out.println("you are Eligble for mains");
			int b=450;
			if(b>= 400)
			{
				System.out.println("You are selected");
				
			}
			else {
				System.out.println("you are not selected");
			}			
		}
		else 
		{
			System.out.println("rejected");
		}
		
	}

}
