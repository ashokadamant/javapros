import java.util.Scanner;
public class Evenornot {
				public static void main(String args[])
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the name");
					String s1=sc.next();
					int length=s1.length();
					if(length%2==0)
					{
						
					System.out.println("it is a even number");
				}
					else
					{
						System.out.println("it is not a even number");
					}

			}

		}


