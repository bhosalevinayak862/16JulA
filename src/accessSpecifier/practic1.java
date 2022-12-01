package accessSpecifier;

public class practic1 
{ 
	protected int a;
	protected practic1()
	{
		a=20;
	
	}	
	 protected void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		practic1 s1=new practic1();
		s1.m1();
		System.out.println(s1.a);
		
		
	}
	
	
	
 
	
}

