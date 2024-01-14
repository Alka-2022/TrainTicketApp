package com.cloudbees.trainbooking.api;

import com.cloudbees.trainbooking.model.TrainSection;
import com.cloudbees.trainbooking.model.User;

public class RemoveUserApi {

    private TrainSection trainSection;

    public RemoveUserApi(TrainSection trainSection) {
        this.trainSection = trainSection;
    }

    public void removeUser(String userEmail) {
        User user = trainSection.getUserByEmail(userEmail);
        if (user != null) {
            trainSection.removeUser(user);
        }
    }
}
