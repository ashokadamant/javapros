import java.util.Scanner;
public class Binary {
	static int bin_to_dec(int n)
	{
		if(n==0)
			return 0;
		else
			return(n%10+2*bin_to_dec(n/10));
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,result;
System.out.println("enter the value is n");
n=sc.nextInt();
result=bin_to_dec(n);
System.out.println("binary to decimal:"+result);
	
}
}
