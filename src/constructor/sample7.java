package constructor;

public class sample7 
{
	public static void main(String[] args)
	{
		sample6 m1=new sample6();
		  m1.add();
		  m1.mul();
		  System.out.println("------");
		  sample6 m2= new sample6(10,20);
		  
		  m2.add();
		  m2.mul();
		
	}

}
