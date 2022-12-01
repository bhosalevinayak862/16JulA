package array;

public class multyArray
{
	
	public static void main(String[] args) 
	{     // 0  1  2
		//0  10 30 70
		//1  40 70 90
		
		
		int[][]ar=new int[2][3];
		ar[0][0]=10;
		ar[0][1]=30;
		ar[0][2]=70;
		ar[1][0]=40;
		ar[1][1]=70;
		ar[1][2]=90;
		
		System.out.println(ar[0][0]);
		System.out.println(ar[0][1]);
		System.out.println("------------------");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
