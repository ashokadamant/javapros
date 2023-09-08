import java.util.Scanner;
public class Even2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the even number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
			if(n%2==0);
		}
		
		System.out.println("given number is even number sum");
}
	}
