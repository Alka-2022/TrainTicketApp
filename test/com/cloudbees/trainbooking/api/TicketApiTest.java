// File: test/com/cloudbees/trainbooking/api/TicketApiTest.java

package test.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.api.TicketApi;
import src.com.cloudbees.trainbooking.model.Ticket;
import src.com.cloudbees.trainbooking.model.TrainSection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketApiTest {

    @Test
    public void testPurchaseTicket() {
        TrainSection trainSection = new TrainSection();
        TicketApi ticketApi = new TicketApi(trainSection);

        User user = new User("John", "Doe", "john.doe@example.com");
        Ticket ticket = ticketApi.purchaseTicket(user, 20);

        assertEquals(user, ticket.getUser());
        assertEquals(20, ticket.getPrice());
        assertEquals(user, trainSection.getSeatsInSection("A").get(0));
    }
}
