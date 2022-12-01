package array;

import java.util.Arrays;

public class practic6 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[8];
		ar[0]=10;
		ar[1]=80;
		ar[2]=30;
		ar[3]=10;
		ar[4]=20;
		ar[5]=60;
		ar[6]=90;
		ar[7]=25;
		System.out.println("------Original Data------");
		
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("------Array Assinding order------");
		
		Arrays.sort(ar);
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
