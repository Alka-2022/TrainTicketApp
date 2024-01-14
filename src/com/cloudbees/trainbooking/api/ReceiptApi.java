package com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.Ticket;

public class ReceiptApi {

    public void viewReceipt(Ticket ticket) {
        System.out.println("Receipt Details:");
        System.out.println("From: " + ticket.getFrom());
        System.out.println("To: " + ticket.getTo());
        System.out.println("User: " + ticket.getUser().getFullName());
        System.out.println("Price Paid: $" + ticket.getPrice());
    }
}
