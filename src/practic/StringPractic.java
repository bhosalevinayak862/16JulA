package practic;

public class StringPractic 
{
	public static void main(String[]args)
	{
	String name="Vinayak";
	char[] ar =new char[name.length()];
	for(int i=0;i<=name.length()-1;i++)
	{
		ar[i]=name.charAt(i);
	}
	
	for(char s1:ar)
	{
		System.out.println(s1);
	}
	
	
	}
	
	
	

}
