package simple;

public class practic6 
{
	static int a=10;  // static globle variable
	
	      int e=150;
	      
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		s1();
		practic6 a1=new practic6();
		a1.s2();
		System.out.println(practic7.b);
		practic7 a3=new practic7();
		System.out.println(a3.d);
		practic6 z1=new practic6();
		System.out.println(z1.e);
		
	}
	public static void s1()
	{
		System.out.println(a);
		practic6 z2=new practic6();
		System.out.println(z2.e);
	}
	public void s2()
	{
		System.out.println(a);
		System.out.println(e);
	}

}
