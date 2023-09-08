import java.util.Scanner;
public class Factors {
			public static void main(StringDemo1[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number is x: ");
				int x=sc.nextInt();
				for(int i=1; i<=x; i++)
				{
					if(x%i==0)
					System.out.println(i+"factors");
				}
			}

		}



