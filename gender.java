import java.util.Scanner;
public class gender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
	  int age = sc.nextInt();
	  System.out.println("enter the name");
	  String name = sc.next();
	  System.out.println("enter the gender");
	  String gender = sc.next();
	  char ch=gender.charAt(0);
	  String prefix;
	  if(ch=='M')
	  {
	  prefix="MR";
	  }
	  else
	  {
		  prefix="MRS";
	  }
	  if(age>=60)
	  {
		  System.out.println(prefix+"."+name+" "+"is senior citizen");
	  }
	  else if(age<=35)
	  {
		  int experience;
		  System.out.println(prefix+" ."+name+" "+"is young person");
		  
		  System.out.println("enter the org name");
		  String orgname=sc.next();
		  
		  System.out.println(prefix+"."+name+" "+"is working person");
		   
		  System.out.println("enter the org name");
		  String s = sc.next();
		  
		  System.out.println("enter the designtion");
		  String designation = sc.next();
		  
		  System.out.println("enter the presant year of working");
		  int presentyear = sc.nextInt();
		  
		  System.out.println("enter the year of joining");
		  int joinyear = sc.nextInt();
		  
		  experience=presentyear-joinyear;
		  
		  
		  
		  
		  
	  }
	}

}
