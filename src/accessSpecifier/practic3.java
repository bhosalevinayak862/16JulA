package accessSpecifier;

public class practic3 
{
	
	int a;
	practic3()
	{
		a=30;
	}
	public void s1()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		practic3 s2=new practic3();
		    s2.s1();
		   System.out.println(s2.a);
	}

}
