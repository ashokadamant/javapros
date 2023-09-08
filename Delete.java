import java.util.Scanner;
public class Delete{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int[10];
			int i,n,location;
			System.out.println("enter the size of array");
			 n=sc.nextInt();
			 System.out.println("enter the array a elements");
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println("enter the location");
			location=sc.nextInt();
			for(i=location-1;i<n;i++)
				a[i]=a[i+1];
			n--;
			for(i=0;i<n;i++)
				System.out.println(a[i]);
			
				
			}
		}



