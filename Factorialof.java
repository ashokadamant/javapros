import java.util.Scanner;
public class Factorialof {
		static int fact (int n)
		{
			if(n==1)
				return 1;
			else
				return(n*fact(n-1));
		}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the values of n");
		n=sc.nextInt();
		result= fact(n);
		System.out.println("factorial of numbers is:"+result);
	}
	}


