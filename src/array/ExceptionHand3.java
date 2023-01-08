package array;

public class ExceptionHand3 
{
public static void main(String[] args)
{

  int a=10;
  int b=0;
  int div;
  try
  {
	  div=a/b; 
  }
 // catch(ArithmeticException h)
  //{
	//  System.out.println("ArithmeticException");
  //}
  catch(Exception k)
  {
	  k.printStackTrace();
	 System.out.println("Generac Exception Handled "); 
  }
 
  System.out.println("Hii");
  System.out.println("Hellow");
  
}
}
