package main.controllers;

import main.model.User;
import main.model.UserLogging;
import main.services.UserLoggingService;
import main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService users;

    @Autowired
    UserLoggingService usersLogs;

    @RequestMapping(value="", method=RequestMethod.GET)
    public User [] getAll() {
        return users.findAll();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        Preconditions.checkNotFound(users.findById(user.getId()));
        Preconditions.validUser(user.valid());
        users.create(user);
    }

    @RequestMapping(value="", method=RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {
        Preconditions.checkFound(users.findById(user.getId()));
        Preconditions.isUserLogged(usersLogs.findById(user.getId())!=null);
        Preconditions.validUser(user.valid());
        users.update(user);
    }

    @RequestMapping(value="/{id:.+}", method=RequestMethod.GET)
    public User getById(@PathVariable String id) {
        Preconditions.checkFound(users.findById(id));
        return users.findById(id);
    }
}
