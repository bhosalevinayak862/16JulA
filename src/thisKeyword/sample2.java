package thisKeyword;

public class sample2 extends sample1
{
	   //int a=20; globle variable fron samle1
       int a=20; //globle variable in samle2
       
       public void m1()
       {
    	   int a=10;
    	   System.out.println(a);
    	   System.out.println(this.a);
    	   System.out.println(super.a);
       }
       public static void main(String[] args)
    {
	      
    	   sample2 s1=new sample2();
    	   s1.m1();


    	   
	}





}
