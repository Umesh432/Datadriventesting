package Com.DataDriventesting;

public class Employee {

	int id ;
	String name;
	
	public Employee(int id,String name) {
		
		this.id=id;
		this.name= name;
	}
	
	@Override
	public String toString() {

        String nameid=this.id + this.name; 
		return nameid;
	}
	
}
