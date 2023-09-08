import java.util.Scanner;
public class Cubes {

			public static void main(StringDemo1[] args)
			{
			Scanner sc= new Scanner(System.in);
					System.out.println("enter the number is x :");
								int x=sc.nextInt();
								int cube=1;
								int	number;
								while(x>0)
								{
									number=x%10;
									x=x/10;
									cube=number*number*number;
								}
						
								System.out.println("cubes of digits :"+cube);

						}
				
			}






