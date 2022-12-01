package practic;

public class demo3 
{
	public static void main(String[] args) 
	{
		dr(10,10);
		demo3 ddr=new demo3();
		ddr.dd(25,25);
		System.out.println("---------------");
		aa("Vinayak", "Bhosale");
		
	}
	public static void dr(int a,int b)
	{
		System.out.println(a+b);
	}
	public void dd(int d,int e)
	{
		System.out.println(d+e);
		
	}
	public static void aa(String fn,String ln)
	{
		System.out.println(fn+" "+ln);
	}
	

}
