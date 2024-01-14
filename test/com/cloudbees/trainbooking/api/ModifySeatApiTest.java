package test.com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.model.TrainSection;
import com.cloudbees.trainbooking.api.ModifySeatApi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifySeatApiTest {

    @Test
    public void testModifyUserSeat() {
        TrainSection trainSection = new TrainSection();
        ModifySeatApi modifySeatApi = new ModifySeatApi(trainSection);

        User user = new User("John", "Doe", "john.doe@example.com");
        trainSection.allocateUserToSection(user, "A");

        modifySeatApi.modifyUserSeat(user.getEmail(), "B");

        assertEquals(user, trainSection.getSeatsInSection("B").get(0));
    }
}
