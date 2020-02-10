package Com.DataDriventesting;

import com.google.gson.Gson;

public class test {

	public static void main(String[] args) {
		
		Employee employee= new Employee(20, "TestJson");
		
        System.out.println(employee.toString());	
        
        Gson gson = new Gson();
        
   String employeeJson = gson.toJson(employee);
   
   System.out.println(employeeJson);
   
   Employee e=gson.fromJson(employeeJson,Employee.class);
   
   System.out.println(e);
   
        
        
        
	}
}
