package src.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.model.TrainSection;

public class RemoveUserApi {
    // Properties
    private TrainSection trainSection;

    // Constructor
    public RemoveUserApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    // Methods
    public void removeUser(String string) {
        // Logic to remove a user from the train section
        trainSection.getSeatsInSection("A").remove(string);
        trainSection.getSeatsInSection("B").remove(string);
    }

    public void removeUser(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeUser'");
    }
}
