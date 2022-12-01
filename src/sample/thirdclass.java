package sample;   // package name

public class thirdclass {//  class name
	//class body
	public static void main(String[]args)//main method
	{
		// main method body
		
		add();//call method
		ad();      // call method
		addition();   //call method from same package with sttic method
		sum(); // call sattic method in same package
		secondclass.gh(); //call static method from different class
		secondclass lo=new secondclass(); //call non static method from different class
		lo.kp(40,40);
		adder(100,200);
		adder1(500,500);
		adder(300,800);
		
		
		
				
	}
	public static void add()
	{
		int a=40;
		int b=40;
		System.out.println(a+b);
		
	}
	public static void ad()	{
		int c=50;
		int d=20;
		System.out.println(c+d);	
		
	}
	public static void addition()
	
	{
		int e=60;
		int f=10;
		
		System.out.println(e+f);
		
	}
	public static void sum()
	{
		int g=30;
		int h=20;
		System.out.println(g+h);
		
	}
	public static void adder(int  num1,int num2)
	{
		System.out.println(num1+num2);
		}
	public static void adder1(int num2,int num3)
	{
		System.out.println(num2+num3);
	}
}
