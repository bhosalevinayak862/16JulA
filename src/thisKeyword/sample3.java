package thisKeyword;

public class sample3 extends sample1 
{
	
	int a=20;
	public void m1()
	{ 
		  int a=20;
		  System.out.println(a);
		  System.out.println(this.a);
		  System.out.println(super.a);
		
		
	}
	  public static void main(String[] args)
	{
		  
		  sample2 s1=new sample2();
		  s1.m1();
		
		  
	}

}
