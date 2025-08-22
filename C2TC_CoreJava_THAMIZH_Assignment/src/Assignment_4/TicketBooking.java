package Assignment_4;

public class TicketBooking {

    private String stageEvent;
    private String customer;
    private int noOfSeats;

    public TicketBooking() {}

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() { return stageEvent; }
    public String getCustomer() { return customer; }
    public int getNoOfSeats() { return noOfSeats; }

    public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }
    public void setCustomer(String customer) { this.customer = customer; }
    public void setNoOfSeats(Integer noOfSeats) { this.noOfSeats = noOfSeats; }

    public void makePayment(Double amount) {
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.printf("Amount %.1f paid in cash%n", amount);
    }

    // 2) Wallet
    public void makePayment(String walletNumber, Double amount) {
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.printf("Amount %.1f paid using wallet number %s%n", amount, walletNumber);
    }

    // 3) Credit card
    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.println("Holder name: " + name);
        System.out.printf("Amount %.1f paid using %s card%n", amount, creditCard);
        System.out.println("CCV: " + ccv);
    }
}

