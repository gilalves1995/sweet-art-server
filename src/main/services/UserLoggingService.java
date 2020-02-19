package main.services;

import main.model.User;
import main.model.UserLogging;

import java.util.List;

public interface UserLoggingService {

    // Finds user by a given id in database
    UserLogging findById(String id);

    // Creates a token into system
    void login(UserLogging user);

    // Deletes the token from system
    void logout(String id);

    List<UserLogging> getAll();
}
