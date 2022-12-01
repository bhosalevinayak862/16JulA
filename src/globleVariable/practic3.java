package globleVariable;

public class practic3
{
	public static void main(String[] args)
	{
		m1();
		practic3 s1=new practic3();
		  s1.m2();
		
		
	}
	public static void m1() 
	{
		System.out.println("Static method");
		
	}
	public void m2()
	{
	    System.out.println("Non static method");
	}

}
