package src.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.model.TrainSection;

public class ModifySeatApi {
    // Properties
    private TrainSection trainSection;

    // Constructor
    public ModifySeatApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    // Methods
    public void modifyUserSeat(User user, String newSection) {
        // Logic to modify a user's seat to the specified section
        trainSection.allocateUserToSection(user, newSection);
    }
}
