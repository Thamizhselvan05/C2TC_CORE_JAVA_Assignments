package Assignment_1.utilities;

import Assignment_1.employees.Employee;

public class EmployeeUtilities {
	
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        
        
        
    }   
    
    public void updateSalary(Employee e, double newSalary) {
        e.setSalary(newSalary);
    }

}
