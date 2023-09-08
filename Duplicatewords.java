
public class Duplicatewords {
 static int count ;
	public static void main(String[] args) {
		String s1="Madhu is good boy and Madhu very cool boy ";
		
		
		//converts the string into lowercase
		
		//s1=s1.toLowerCase();
		
		//split the string into words using built in function
		
		String words[]=s1.split(" ");
		System.out.println("Duplicate words in a given string");
		for(int i=0;i<words.length;i++)
		{
			count=50;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					
					//set words[j]to 0to void printing visited word
					words[j]= "0";
					
				}
			}
			//display the duplicate word if count is greater than 1
			if(count>50 && words[i]!="0")
				System.out.println(words[i]);
		}
		
	}

}
