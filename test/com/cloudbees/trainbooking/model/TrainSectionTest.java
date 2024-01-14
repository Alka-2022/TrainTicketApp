// File: test/com/cloudbees/trainbooking/model/TrainSectionTest.java

package test.com.cloudbees.trainbooking.model;

import org.junit.jupiter.api.Test;

import src.com.cloudbees.trainbooking.model.TrainSection;
import src.com.cloudbees.trainbooking.model.User;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainSectionTest {

    @Test
    public void testAllocateUserToSection() {
        TrainSection trainSection = new TrainSection();
        User user = new User("John", "Doe", "john.doe@example.com");

        trainSection.allocateUserToSection(user, "A");
        List<User> seatsInSectionA = trainSection.getSeatsInSection("A");
        assertEquals(user, seatsInSectionA.get(0));

        trainSection.allocateUserToSection(user, "B");
        List<User> seatsInSectionB = trainSection.getSeatsInSection("B");
        assertEquals(user, seatsInSectionB.get(0));
    }
}
