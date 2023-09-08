import java.util.Scanner;
public class FirstandLast {
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the charater");
				String s1=sc.next();
				char ch1=s1.charAt(0);
				char ch2=s1.charAt(s1.length()-1);
				System.out.println(ch1+""+ch2);
				
			
			}

		}
		

