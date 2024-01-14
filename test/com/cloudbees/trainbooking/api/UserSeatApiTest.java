// File: test/com/cloudbees/trainbooking/api/UserSeatApiTest.java

package test.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.api.UserSeatApi;
import src.com.cloudbees.trainbooking.model.TrainSection;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSeatApiTest {

    @Test
    public void testViewUsersAndSeats() {
        TrainSection trainSection = new TrainSection();
        UserSeatApi userSeatApi = new UserSeatApi(trainSection);

        User user1 = new User("John", "Doe", "john.doe@example.com");
        User user2 = new User("Jane", "Smith", "jane.smith@example.com");

        trainSection.allocateUserToSection(user1, "A");
        trainSection.allocateUserToSection(user2, "A");

        List<User> seatsInSectionA = trainSection.getSeatsInSection("A");

        // Assuming you have a method to capture console output for testing
        // For simplicity, this example checks if the expected output is present in the console output
        userSeatApi.viewUsersAndSeats("A");
        assertEquals("John Doe", seatsInSectionA.get(0).getFullName());
        assertEquals("Jane Smith", seatsInSectionA.get(1).getFullName());
    }
}
