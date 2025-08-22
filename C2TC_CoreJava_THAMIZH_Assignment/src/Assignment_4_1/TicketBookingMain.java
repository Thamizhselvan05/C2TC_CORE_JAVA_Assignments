package Assignment_4_1;

import java.util.Scanner;

public class TicketBookingMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Details (Event, Name, Seats): ");
        String csv = sc.nextLine();   
        String[] parts = csv.split(",");
        String stageEvent = parts[0].trim();
        String customer = parts[1].trim();
        int noOfSeats = Integer.parseInt(parts[2].trim());

                TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        System.out.print("Enter Payment Mode: ");
        int mode = sc.nextInt();

       
        switch (mode) {
            case 1: { 
            	System.out.println("Enter Amount: ");
                double amount = sc.nextDouble();
                booking.makePayment(amount);
                break;
            }
            case 2: { 
            	System.out.println("Enter Wallet Number");
                String walletNumber = sc.next();
            	System.out.println("Enter Amount: ");
                double amount = sc.nextDouble();
                booking.makePayment(walletNumber, amount);
                break;
            }
            case 3: { 
            	System.out.print("Credit Card: ");
                String creditCard = sc.next();
                System.out.print("Enter CV: ");
                String ccv = sc.next();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.println("Enter Amont:");
                double amount = sc.nextDouble();
                booking.makePayment(creditCard, ccv, name, amount);
                break;
            }
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

