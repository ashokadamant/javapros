package p2;

public class Employee implements Comparable {
  String name;
  int eid;
  
  Employee(String name, int eid){
	  this.name= name;
	  this.eid=eid;
	  
  }
  public String toString() {
	  return name+"_"+eid;
  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid= this.eid;
		Employee e= (Employee)o;
		if(eid<e.eid)
		{
			return  -1;
			
		}
		else if(eid>e.eid) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
