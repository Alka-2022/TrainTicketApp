package com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.model.Ticket;
import com.cloudbees.trainbooking.model.TrainSection;

public class TicketApi {
    // Properties
    private TrainSection trainSection;

    // Constructor
    public TicketApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    // Methods
    public Ticket purchaseTicket(User user, int price) {
        // Logic to purchase a ticket and allocate a seat to the user
        Ticket ticket = new Ticket(user, price);
        trainSection.allocateUserToSection(user, "A"); // Assuming default section is "A"
        return ticket;
    }
}
