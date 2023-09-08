
public class Constructor {
int a;
String raju;
float o;

void Constructor(int a)
{
	this.a=a;
	System.out.println("0-arg");
}
void display(int a)
{
	System.out.println("1-arg");
}
public static void main(String [] madhu) {
	Constructor c1=new Constructor();
	c1.Constructor(10);
}
}
