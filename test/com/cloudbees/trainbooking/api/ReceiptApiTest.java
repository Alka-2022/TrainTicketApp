package test.com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.Ticket;
import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.api.ReceiptApi;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptApiTest {

    @Test
    public void testViewReceipt() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ReceiptApi receiptApi = new ReceiptApi();
        User user = new User("John", "Doe", "john.doe@example.com");
        Ticket ticket = new Ticket(user, 20);

        receiptApi.viewReceipt(ticket);

        assertEquals("Receipt Details:\nFrom: null\nTo: null\nUser: John Doe\nPrice Paid: $20\n", outContent.toString());
    }
}
