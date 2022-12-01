package globleVariable;

public class practic1
{
      int num=20;
      int a=10;
      static int num1=50;
      static int num2=100;
      
      public void m1()
	{
		System.out.println(a);
		System.out.println(num1);
	}
      public void m2()
      {
    	  System.out.println(num);
    	  System.out.println(num2);
    	  
      }
      
      public static void m3()
      {
    	  System.out.println("-------------");
    	  
    	  System.out.println(num1);
    	  System.out.println(num2);
    	  //System.out.println(num);
    	  //System.out.println(a);
    	  
      }
      

}
