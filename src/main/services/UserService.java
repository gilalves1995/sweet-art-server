package main.services;

import main.model.User;

public interface UserService {

    // Finds all users in database
    User [] findAll();

    // Creates a new user
    void create(User user);

    // Updates a given user
    void update(User user);

    // Finds the user with the given email
    User findById(String email);

}
