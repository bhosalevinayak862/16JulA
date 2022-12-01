package constructor;

public class sample4
{
	int num1;
	int num2;
	
	sample4(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		sample4 s1=new sample4(10,20);
		s1.add();
		s1.mul();
		
		
		sample4 s2=new sample4(30,90);
		s2.add();
		s2.mul();
	}
	

}
