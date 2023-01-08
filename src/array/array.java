package array;

import java.util.Arrays;

public class array 
{
	public static void main(String[] args) 
	{
		int[] ar={10,67,90,40,54,55,88};
		String[] sar= {"Vinayak","bhosale","jarali","kolhapur"};
		System.out.println(ar[0]);
		
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("---------array sort---------");
		Arrays.sort(sar);
		for(int j=0;j<=sar.length-1;j++)
		{
			System.out.println(sar[j]);
		}
		
		
	}

}
