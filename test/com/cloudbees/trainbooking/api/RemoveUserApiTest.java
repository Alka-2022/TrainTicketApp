// File: test/com/cloudbees/trainbooking/api/RemoveUserApiTest.java

package test.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.api.RemoveUserApi;
import src.com.cloudbees.trainbooking.model.TrainSection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveUserApiTest {

    @Test
    public void testRemoveUser() {
        TrainSection trainSection = new TrainSection();
        RemoveUserApi removeUserApi = new RemoveUserApi(trainSection);

        User user = new User("John", "Doe", "john.doe@example.com");
        trainSection.allocateUserToSection(user, "A");

        removeUserApi.removeUser(user.getEmail());

        assertNull(trainSection.getSeatsInSection("A").get(0));
    }
}
