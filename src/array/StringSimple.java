package array;



public class StringSimple 
{
	public static void main(String[] args)
	{
		String s1="Velocity";
		String s2="";
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(0));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('V'));
		System.out.println(s1.indexOf('y'));
		System.out.println(s1.lastIndexOf('t'));
		
		
		String s3="My Name Is Vinayak";
		String[] sep = s3.split(" ");
		
		System.out.println(sep[0]);
		for(int i=0;i<=sep.length-1;i++)
		{
			System.out.println(sep[i]);
		}
			
		
		
		
		
		
		
		
	}

}
