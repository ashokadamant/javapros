import java.util.Scanner;
public class Divisible 
	{
	public static void main(StringDemo1[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value is : x");
	int x = sc.nextInt();
	if(x%5==0)
	{
	System.out.println("x is divisible by 5");
	}
	else if(x%11==0)
	{
	System.out.println("x is divisible by 11");
	}
	else
	{
	System.out.println("x is not divisible by 5 and 11");
	}
	}
	} 




