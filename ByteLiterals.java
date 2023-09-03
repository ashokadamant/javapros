class  ByteLiterals
{
	public static void main(String[] args) 
	{
		byte x=10;
		byte y=(byte)-129.5;
		byte b='a';
		byte b1=(byte)10.5;
		byte b2=(byte)100.234f;
	    System.out.println(y);
	    System.out.println(x);
	    System.out.println(b);
	     System.out.println(b1);
	    System.out.println(b2);
		 char ch='\u0061';
		 System.out.println(ch);
		  int b7=ch+32;
		  System.out.println(b7);
		  char ch1='\n';
		  System.out.println(ch1);
		  char ch2='\t';
		  System.out.println(ch2);
		  short s;
		  char ch3='a';
		  s='a';
		  System.out.println(s);
		  
		   char ch4= (char)(65536+97);// possibly lossy conversion from int to char because char range 0 to 65535
		   // and int range to -2**15 to 2**15-1
		   System.out.println(ch4);
		   
		   



		  //ch=s; CE: possibly lossy conversion from short to char
		  //s=ch; CE: possibly lossy conversion from char to short but we can assign char literal to short 
		  // because we take char literal as integer by default in integral literals .





		 

		
	   
	}
}
