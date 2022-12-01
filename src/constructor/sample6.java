package constructor;

public class sample6 
{
	int num1;
	int num2;
	String name;
	sample6(int a, int b)
	{
		num1=a;
		num2=b;
	}
	sample6()
	{
		num1=60;
		num2=60;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	

}
