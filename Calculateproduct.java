	import java.util.Scanner;
public class Calculateproduct{

					public static void main(StringDemo1[] args)
					{
						Scanner sc= new Scanner(System.in);
						System.out.println("enter the number is x :");
						int x=sc.nextInt();
						int product=1;
						int	number;
						while(x>0)
						{
							number=x%10;
							x=x/10;
							product=product*number;
						}
				
						System.out.println("product of digits :"+product);

				}
		
	}



