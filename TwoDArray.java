import java.util.*;
class TwoDArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[][] x= new int[3][];
		x[0]=new int[2];
		x[1]=new int[3];
		x[2]=new int[4];
		for (int i=0;i<x[0].length ;i++ )
		{
			Scanner sc= new Scanner(System.in);
           x[0][i]=sc.nextInt();
		}
		for (int i=0;i<x[1].length ;i++ )
		{
			Scanner sc= new  Scanner(System.in);
			x[1][i]=sc.nextInt();
		}
		for (int i=0;i<x[2].length ;i++ )
		{
			Scanner sc= new Scanner(System.in);
			x[2][i]=sc.nextInt();
		}
		for (int i:x[0] )

		{
			System.out.println(i);
		}
		for(int i:x[1])
		{
			System.out.println(i);
		}
		for(int i: x[2])
		{
			System.out.println(i);
		}
	}
}
