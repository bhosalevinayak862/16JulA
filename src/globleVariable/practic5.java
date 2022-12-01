package globleVariable;

public class practic5 
{
	int num1;
	int num2;
	
	practic5(int a, int b)
	{
		num1=a;
		num2=b;
			
	}
	public void m1()
	{
		System.out.println(num1+num2);
		
	}
	public void m2()
	{
		System.out.println(num1*num2);
		
	}
	public static void main(String[] args) 
	{
		practic5 s1=new practic5(10,20);
		s1.m1();
		s1.m2();
		
		practic5 s2=new practic5(25,35);
		s2.m1();
		s2.m2();
		System.out.println("----------");
		
		practic6 s3=new practic6(60,80);
		s3.add();
		s3.mul();
		
		
	}
}
