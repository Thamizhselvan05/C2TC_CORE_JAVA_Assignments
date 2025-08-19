package Assignment_2;

import java.util.Scanner;

public class Student {
	
	 public Student() {
	        System.out.println("Student object is created");
	    }
	}


	class Commission {
	  
	    String name, address;
	    String phone;
	    double salesAmount;

	    
	    void acceptDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = sc.nextLine();

	        System.out.print("Enter address: ");
	        address = sc.nextLine();

	        System.out.print("Enter phone number: ");
	        phone = sc.nextLine();

	        System.out.print("Enter sales amount: ");
	        salesAmount = sc.nextDouble();
	    }

	  
	    void calculateCommission() {
	        double commission = 0;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Commission for " + name + ": ₹" + commission);
	    }
	

}
