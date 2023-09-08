 import java.util.Scanner;
public class Count {
	public static void main(StringDemo1[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number are x :");
		int x=sc.nextInt();
		int count=0;
		while(x!=0)
		{
		x/=10;
			++count;
		}
		System.out.println("number of digits:"+count);
	}

	{
		
	}

}
