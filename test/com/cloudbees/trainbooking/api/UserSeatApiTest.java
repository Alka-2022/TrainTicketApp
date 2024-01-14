package test.com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.model.TrainSection;
import com.cloudbees.trainbooking.api.UserSeatApi;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSeatApiTest {

    @Test
    public void testViewUsersAndSeats() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TrainSection trainSection = new TrainSection();
        UserSeatApi userSeatApi = new UserSeatApi(trainSection);

        User user1 = new User("John", "Doe", "john.doe@example.com");
        User user2 = new User("Jane", "Smith", "jane.smith@example.com");

        trainSection.allocateUserToSection(user1, "A");
        trainSection.allocateUserToSection(user2, "A");

        List<User> seatsInSectionA = trainSection.getSeatsInSection("A");

        userSeatApi.viewUsersAndSeats("A");

        assertEquals("John Doe - Seat: A\nJane Smith - Seat: A\n", outContent.toString());
    }
}
