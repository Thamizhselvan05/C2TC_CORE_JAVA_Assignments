package Assignment_1.employees;

public class Manager extends Employee {
	
	private String department;

    public Manager(String name, long employeeId, double salary, String department) {
    	super(department, 0, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
