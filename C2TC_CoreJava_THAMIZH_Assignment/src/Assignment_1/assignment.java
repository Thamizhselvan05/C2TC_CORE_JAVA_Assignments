package Assignment_1;

import Assignment_1.employees.Manager;
import Assignment_1.utilities.EmployeeUtilities;
import Assignment_1.employees.Developer;


public class assignment{
	public static void main(String [] args) {
		Manager m = new Manager(null, 0, 0, null);
		Developer newdev = new Developer(null, 0, 0);
		
		   m.setEmployeeId(1);
	        m.setName("Thamizh");
	        m.setSalary(90000);
	        m.setDepartment("HR");

	        Developer d = new Developer(null, 0, 0);
	        d.setEmployeeId(2);
	        d.setName("Anandavel");
	        d.setSalary(70000);
	        d.setProgrammingLanguage("Java");

	        EmployeeUtilities util = new EmployeeUtilities();
	        util.printEmployeeDetails(m);
	        util.printEmployeeDetails(d);

	        util.updateSalary(d, 80000);
	        System.out.println("After salary update:");
	        util.printEmployeeDetails(d);
	    }
		
	}
