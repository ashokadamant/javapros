import java.util.*;
class TwodArrayCopy2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[][] x = new int[3][];
		for (int i=0;i<x.length ;i++ )
		{
			x[i]=new int[2];
			for (int j=0;j<x[i].length ; j++)
			{
				Scanner sc= new Scanner(System.in);
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(x));

	}
}
