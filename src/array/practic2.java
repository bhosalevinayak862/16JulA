package array;

public class practic2 
{
   public static void main(String[]args)
   {
	   int[] ar=new int[5];
	   
	   ar[0]=10;
	   ar[1]=20;
	   ar[2]=30;
	   ar[3]=50;
	   ar[4]=8;
	   
	   System.out.println(ar.length);
	   System.out.println(ar.length-1);
	   
	   System.out.println("---------");
	       
	   for(int i=0;i<=ar.length-1;i++)
	   {
		   System.out.println(ar[i]);
	   }

	   System.out.println(ar[0]);
	   
   }
	
	
}
