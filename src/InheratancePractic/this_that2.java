package InheratancePractic;

public class this_that2 extends this_that1
{
	int a=20;
	
	public void asd() 
	{
		int a=30;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("-------------------");
		System.out.println(a+this.a+super.a);
	}

}
