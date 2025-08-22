package Assignment_4;

import java.util.Scanner;

public class TicketBookingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter booking details as: stageEvent, customer, noOfSeats");
        String csv = sc.nextLine().trim(); // e.g. RockConcert, John, 2

        String[] parts = csv.split(",");
        if (parts.length < 3) {
            System.out.println("Invalid input. Expected: stageEvent, customer, noOfSeats");
            sc.close();
            return;
        }

        String stageEvent = parts[0].trim();
        String customer = parts[1].trim();
        int noOfSeats;
        try {
            noOfSeats = Integer.parseInt(parts[2].trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of seats.");
            sc.close();
            return;
        }

        if (noOfSeats <= 0) {
            System.out.println("Number of seats must be positive.");
            sc.close();
            return;
        }

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

 
        System.out.println("Enter payment mode: 1 (Cash), 2 (Wallet), 3 (Credit Card)");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid mode.");
            sc.close();
            return;
        }
        int mode = sc.nextInt();
        sc.nextLine(); 

        switch (mode) {
            case 1: {
                System.out.println("Enter amount:");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid amount.");
                    break;
                }
                double amount = sc.nextDouble();
                booking.makePayment(amount);
                break;
            }
            case 2: {
                System.out.println("Enter amount then wallet number (same line or next line):");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid amount.");
                    break;
                }
                double amount = sc.nextDouble();
                String walletNumber = sc.next(); // allows same line or next line
                booking.makePayment(walletNumber, amount);
                break;
            }
            case 3: {
                
                System.out.println("Enter credit card number and CCV (same line):");
                String firstLine = sc.nextLine().trim();
                while (firstLine.isEmpty()) firstLine = sc.nextLine().trim();
                String[] ccParts = firstLine.split("\\s+");
                if (ccParts.length < 2) {
                    System.out.println("Invalid input. Expected: <cardNumber> <ccv>");
                    break;
                }
                String creditCard = ccParts[0];
                String ccv = ccParts[1];

                System.out.println("Enter card holder name (can have spaces):");
                String name = sc.nextLine().trim();

                System.out.println("Enter amount:");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid amount.");
                    break;
                }
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
