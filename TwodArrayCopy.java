import java.util.Arrays;
class TwodArrayCopy
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[][] x= {{10,20,30},
			{34,56,78,45},
			{234,5567,789,2}};
		int[][] y= new int[x.length][];
		for (int i=0;i<y.length ;i++ )
		{
		   y[i]=new int[x[i].length];
		   for (int j=0;j<y[i].length ;j++ )
		   {
			   y[i][j]=x[i][j];
		   }

		}
		System.out.println(Arrays.deepToString(y));
	}
}
