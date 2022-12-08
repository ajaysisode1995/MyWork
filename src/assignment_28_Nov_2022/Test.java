package assignment_28_Nov_2022;

import java.util.ArrayList;
import java.util.List;

class NoEmployeeFoundException extends RuntimeException {

	public NoEmployeeFoundException(String message) {
		super(message);
		
	}
	
}
 
// A Class that uses above MyException


public class Test {
	static List<Employee> l=new ArrayList<>();
	
   
    public static void main(String args[])
    {
        l.add(new Employee(100,"Ajay","Washim", 27, 500000));
        l.add(new Employee(101,"Sagar","Pune", 30, 550000));
        l.add(new Employee(102,"Sonali","Latur", 26, 600000));
        l.add(new Employee(100,"Vijay","Beed", 30, 700000));
        
        check("");
    }

	private static void check(String string) {
		Employee employee=new Employee();
		if (employee.getEmpId()==100) {
			return;
		}
		else if (employee.getEmpId()==101) {
			return;
		}
		else {
			throw new NoEmployeeFoundException("Employee not found");
		} 
	}
}