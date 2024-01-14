package src.com.cloudbees.trainbooking.api;

import src.com.cloudbees.trainbooking.model.User;
import src.com.cloudbees.trainbooking.model.TrainSection;

import java.util.List;

public class UserSeatApi {
    // Properties
    private TrainSection trainSection;

    // Constructor
    public UserSeatApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    // Methods
    public void viewUsersAndSeats(String section) {
        // Logic to view users and their allocated seats in the specified section
        List<User> seatsInSection = trainSection.getSeatsInSection(section);

        System.out.println("Section " + section + " Seats:");
        for (User user : seatsInSection) {
            System.out.println("Seat: " + user.getFullName() + " - Email: " + user.getEmail());
        }
    }
}