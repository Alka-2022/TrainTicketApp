package com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.TrainSection;
import com.cloudbees.trainbooking.model.User;

public class ModifySeatApi {

    private TrainSection trainSection;

    public ModifySeatApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    public void modifyUserSeat(String userEmail, String seat) {
        User user = trainSection.getUserByEmail(userEmail);
        trainSection.removeUser(user);
        trainSection.allocateUserToSection(user, seat);
    }
}
