package test.com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.model.Ticket;
import com.cloudbees.trainbooking.model.TrainSection;
import com.cloudbees.trainbooking.api.TicketApi;

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
