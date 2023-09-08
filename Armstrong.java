import java.util.Scanner;
public class Armstrong {
	public static void main(StringDemo1[] args)
	{
		int count=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int temp = x;
		while(x>0) {
			x = x/10;
			count++;
		}
		x = temp;
		while(x>0) {
			int r = x%10;
			sum = (int) (sum + Math.pow(r, count));
			x = x/10;
		}
	     if(sum==temp) {
			System.out.println( "is amstrong number");}
		 else {
			System.out.println("not a amstrong number");}
	}
	}
