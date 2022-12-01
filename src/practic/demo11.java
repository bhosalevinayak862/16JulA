package practic;

public class demo11 
{
	int num1;
	int num2;
	
	demo11(int a,int b)
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
       demo11 as=new demo11(10,20);
             as.add();
             as.mul();
	   
	}

}
