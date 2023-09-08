import java.util.Scanner;
public class decimal {
		static String dec_to_bin(int n)
		{
			if(n==0)
				return "";
			else
				return(n%2+" "+dec_to_bin(n/2));
		}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n;
	String result;
	System.out.println("enter the value is n");
	n=sc.nextInt();
	result=dec_to_bin(n);
	System.out.print("decimal to binary:");
	for(int i=result.length()-1;i>=0;i--) {
		char ch= result.charAt(i);
		
		System.out.print(ch);
	}
	
		
	}
	}
	