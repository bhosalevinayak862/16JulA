package array;

public class practic_array
{
	public static void main(String[] args) 
	{
		String s1="vinayak";
		String s2="my Name Is Vinayak";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s2.charAt(0));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.startsWith(s1, 'v'));
		
	String[]sl=s2.split(" ");
	System.out.println(s2);
	for(int i=0;i<=sl.length-1;i++) 
	{
		System.out.println(sl[i]);
	}
		
		
	}

}
