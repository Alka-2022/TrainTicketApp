package src.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.Ticket;
import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.model.TrainSection;

public class TicketApi {
    // Properties
    private TrainSection trainSection;

    // Constructor
    public TicketApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    // Methods
    public Ticket purchaseTicket(User user, int price) {
        // Assume some logic for ticket purchase
        Ticket ticket = new Ticket(user, price);
        // Allocate user to a section
        trainSection.allocateUserToSection(user, "A");
        return ticket;
    }
}
