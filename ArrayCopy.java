import java.util.*;
class ArrayCopy 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int [] x= {10,20,30,40};
		 int [] y= new int[4];
		for (int i=0;i<x.length ;i++ )
		{
             y[i]=x[i];

		}
		for (int i=0;i<y.length ;i++ )
		{
			System.out.println(y[i]);
		}

        System.out.println(Arrays.toString(y));

	}
}
