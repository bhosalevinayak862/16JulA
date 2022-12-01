package practic;

public class demo1 
{
	public static void main(String[] args) 
	{
		s2();
		System.out.println("---------------");
		
		demo1 s3=new demo1();
		s3.s2();
		
		
		
		
	}
	
	public void s1()
	{
		System.out.println("Non Static regular method run");
	}
	public static void s2()
	{
		System.out.println("Static regular method run");
	}
	

}
