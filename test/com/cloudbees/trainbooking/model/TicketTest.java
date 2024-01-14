// File: test/com/cloudbees/trainbooking/model/TicketTest.java

package test.com.cloudbees.trainbooking.model;

import org.junit.jupiter.api.Test;

import src.com.cloudbees.trainbooking.model.Ticket;
import src.com.cloudbees.trainbooking.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    @Test
    public void testGetUser() {
        User user = new User("John", "Doe", "john.doe@example.com");
        Ticket ticket = new Ticket(user, 20);
        assertEquals(user, ticket.getUser());
    }

    @Test
    public void testGetPrice() {
        User user = new User("John", "Doe", "john.doe@example.com");
        Ticket ticket = new Ticket(user, 20);
        assertEquals(20, ticket.getPrice());
    }
}
