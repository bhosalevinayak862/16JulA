package array;

public class Arraymultydia 
{
	public static void main(String[] args) 
	{
		int[][] ar=new int[3][3];
		ar[0][0]=10;
		ar[0][1]=35;
		ar[0][2]=65;
		ar[1][0]=1;
		ar[1][1]=8;
		ar[1][2]=55;
		ar[2][0]=45;
		ar[2][1]=22;
		ar[2][2]=75;
		//2nd approach multidimansatiion array
		int[][] aar= {{10,20,50,80},{45,55,35,20}};
		
		
		
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
