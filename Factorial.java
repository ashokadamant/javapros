import java.util.Scanner;
public class Factorial {
		public static void main(StringDemo1[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number is x: ");
			int x=sc.nextInt();
			int fact=1;
			for(int i=1; i<=x; i++)
			{
				fact=fact*i;
				//int number =x*i;
				System.out.println("factorial of no's:"+fact);
			}
		}

	}


