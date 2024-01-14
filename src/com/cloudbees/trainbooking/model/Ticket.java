package com.cloudbees.trainbooking.model;

public class Ticket {
    // Properties
    private User user;
    private int price;
    private String from; // Add from property
    private String to;   // Add to property

    // Constructor
    public Ticket(User user, int price, String from, String to) {
        this.user = user;
        this.price = price;
        this.from = from;
        this.to = to;
    }

    // Methods
    public User getUser() {
        return user;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {  // Add getFrom method
        return from;
    }

    public String getTo() {    // Add getTo method
        return to;
    }
}
