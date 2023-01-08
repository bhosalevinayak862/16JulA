package array;

import java.util.Arrays;

public class SimpleArray 
{
	
	public static void main(String[] args) 
	{
	String[] ar=new String[5];
	int[] iar=new int[3];
	
	ar[0]="Vinayak";
	ar[1]="bhosale";
	ar[2]="Vinayak";
	ar[3]="kolhapur";
	ar[4]="Jarali";
	
	iar[0]=100;
	iar[1]=26;
	iar[2]=45;
	System.out.println(iar[1]);
	System.out.println(iar.length);
	System.out.println(ar[0]);
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("----Array reverse Order----");
	for(int k=ar.length-1;k>=0;k--)
	{
		System.out.println(ar[k]);
	} 
	System.out.println("------Int Array-----");
	for(int j=0;j<=iar.length-1;j++)
	{
		System.out.println(iar[j]);
	}
	System.out.println("--sort--");
	Arrays.sort(iar);
	for(int s=0;s<=iar.length-1;s++)
	{
		System.out.println(iar[s]);
	}
	
	
	
			
	}

}
