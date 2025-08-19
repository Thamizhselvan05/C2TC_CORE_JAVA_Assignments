package Assignment_1.employees;

public class Developer extends Employee {
	
	 public Developer(String name, int employeeId, double salary) {
		super(name, employeeId, salary);
		
	}

	 private String programmingLanguage;

	   
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	
	

}
