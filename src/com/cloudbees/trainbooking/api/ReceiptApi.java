package src.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.Ticket;

public class ReceiptApi {
    // Methods
    public void viewReceipt(Ticket ticket) {
        System.out.println("Receipt for " + ticket.getUser().getFullName());
        System.out.println("Price: $" + ticket.getPrice());
        // Add more receipt details if needed
    }
}
