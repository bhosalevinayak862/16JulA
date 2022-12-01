package constructor;

public class sample5            //multiple constructor
{
   int num1;
   int num2;
   String name;
   sample5(int a, int b)   // user defined constructor with parameter
   {
	   num1=a;
	   num2=b;
   }
   sample5()
   {
	   num1=10;
	   num2=20;
	   
   }
   sample5(String m1)
   {
	   name=m1;
   }
   public void add()
   {
	   
	   System.out.println(num1+num2);
   }
   public void mul()
   {
	   System.out.println(num1*num2);
   }
   public void stud()
   {
	   System.out.println(name);
   }
   public static void main(String[] args) 
   {
	sample5 s1=new sample5(25,25);
	s1.add();
	s1.mul();
	
	sample5 s2=new sample5();
	s2.add();
	s2.mul();
	sample5 s3=new sample5("Vinayak");
	s3.stud();
	
	
	
   }
   
   
   
   
   
   
}
