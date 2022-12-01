package constructor;

public class sample1
{
      int num1;
      int num2;
      sample1()           //user defined constructor without parameter
      {
    	  num1=45;
    	  num2=55;
    	      	  
      }
      public void add()
      {
    	  System.out.println(num1+num2);
      }
      public static void main(String[] args)
    {
    	  sample1 s1=new sample1();
    	  s1.add();
		
	}
        
        
        
        
}
