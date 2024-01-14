package com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.User;
import com.cloudbees.trainbooking.model.TrainSection;

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
        // Logic to view users and their seats in the specified section
        List<User> seatsInSection = trainSection.getSeatsInSection(section);
        System.out.println("Users and Seats in Section " + section + ":");
        for (User user : seatsInSection) {
            System.out.println(user.getFullName() + " - Seat: " + section);
        }
    }
}
