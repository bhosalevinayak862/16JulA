package accessSpecifier;

public class practic4 
{
	int num2;
	
	practic4()
	{
		num2=40;
		
		
	}
	public void s1()
	{
		System.out.println(num2);
	}
	public static void main(String[] args)
	{
		practic4 s2=new practic4();
		 s2.s1();
		 System.out.println(s2.num2);
		
	}

}
