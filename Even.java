import java.util.Scanner;
public class Even
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter first person age:");
		int age1 = sc.nextInt();
		System.out.println("enter the first person name:");
		String name1 = sc.next();
		System.out.println("enter second person the age:");
		int age2 = sc.nextInt();
		System.out.println("enter second person name");
		String name2 = sc.next();
		if(age1>age2)
		{
			System.out.println(name1+"is elder than" +name2);
		}
		else if(age2<age1)
			{
				System.out.println(name1+"is"  +"years old");
			}
			else 
			{
				System.out.println(name2+ "is elder than" +name1);
			}
				
			
				System.out.println(name2+ "is" + "years old");
			}
		}
		
	



