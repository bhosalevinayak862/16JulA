package Exceptionhandling;

public class sample1 
{
   public static void main(String[]args)
   {
	   int [] ar=new int[4];
	   
	   try
	   {
		   ar[8]=10;
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("ArrayIndexOutOfBoundsExceptionHandled");
	   }
	   System.out.println("Hii");
	   System.out.println("Hellow");
	   
   }
		
	}



