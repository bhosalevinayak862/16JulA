package variables1;

public class practise1 {
	//non static globle variable call from same class
	
	int a=10;   //Globle Non static variable
	static int v=800;
	public static void main(String[]args)
	{
		System.out.println("____");
		//call method  non static variable in same class
		practise1 as=new practise1();   //same class object name creation 
		System.out.println(as.a); //object name.variabke name
		we();
		practise1 dd=new practise1();
		dd.er();
		System.out.println(v);
		
		System.out.println(v);
	}
	public static void we()
	{
		System.out.println("____");
		practise1 gg=new practise1();
		System.out.println(gg.a);
		System.out.println(v);
		}	
	public void er()
	{
		System.out.println("_____");
		System.out.println(a);
		System.out.println("non static method "+v);
	}
}
