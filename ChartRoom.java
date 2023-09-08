
import java.util.*;
public class ChartRoom {
private String roomname;
LinkedHashSet<String> Generalmeeting=new LinkedHashSet<String>();
public ChartRoom(String roomname)
{
	this.roomname=roomname;
}
public void addUser(String name)
{
	Generalmeeting.add(name);
}
public void removeUser(String name)
{
	Generalmeeting.remove(name);
}
public void displayData()
{
for(String s:Generalmeeting)
{
	System.out.println(s);
}
}
public static void main(String arg[])
{
	ChartRoom room=new ChartRoom("roomname");
	room.addUser("madhu");
	room.addUser("raj");
	room.addUser("naveen");
	room.addUser("vamsi");
	room.addUser("raghava");
	 room.displayData();
	 System.out.println("********");
	 room.removeUser("madhu");
	 room.removeUser("raghava");
	 room.displayData();
}
}
