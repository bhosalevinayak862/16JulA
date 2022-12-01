package globleVariable;

public class practic6 
{
	int num3;
	int num4;
	
	practic6(int a, int b)
	{
	   num3=a;
	   num4=b;
	   
	}
	public void add()
	{
		System.out.println(num3+num4);
	}
	public void mul()
	{
		System.out.println(num3*num4);
	}
	public static void main(String[] args) 
	{
		practic7 s1=new practic7(35,35);
		s1.add();
		s1.mul();
		s1.sub();
		
		
		
	}

}
