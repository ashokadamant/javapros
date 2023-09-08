import java.util.Scanner;
public class CalculatSumOfDigits{

				public static void main(String[] args)
				{
					Scanner sc= new Scanner(System.in);
					System.out.println("enter the number is x :");
					int x=sc.nextInt();
					int sum=0;
					int	number;
					while(x>0)
					{
						number=x%10;
						x=x/10;
						sum=sum+number;
					}
			
					System.out.println("sum of digits :"+sum);

			}
	
}

