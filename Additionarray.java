import java.util.Scanner;
public class Additionarray {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int a[][]=new int[10][10];
			int b[][]=new int[10][10];
			int c[][]=new int[10][10];
			int row,col,i,j;
			System.out.println("enter the order of array a");
			row=sc.nextInt();
			col=sc.nextInt();
			System.out.println("enter the two dimensional array element");
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					a[i][j]=sc.nextInt();
				
				}
			}
			System.out.println("enter the two dimensional array b elements");
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.println(c[i][j]+"\t");
			
		}
				System.out.println();

	}

}
}