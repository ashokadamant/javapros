import java.util.Scanner;
public class Firstlast{
	public static void main(StringDemo1[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int l=x%10;
		int f=0;
		while(x>0) {
			f=x%10;
			x=x/10;
		}
		
		System.out.println("First: "+f+" Last: "+l);
	}
}
	
	
	