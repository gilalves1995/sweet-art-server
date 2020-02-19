package main.controllers;

import main.model.User;
import main.model.UserLogging;
import main.services.UserLoggingService;
import main.services.UserService;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/log")
public class UserLoggingController {

    @Autowired
    UserLoggingService usersLogs;

    @Autowired
    UserService users;

    @RequestMapping(value="/{id:.+}", method=RequestMethod.GET)
    public UserLogging get(@PathVariable String id){
        Preconditions.checkFound(users.findById(id));
        Preconditions.checkNotFound(usersLogs.findById(id));
        return usersLogs.findById(id);
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public void login(@RequestBody UserLogging user) {
        Preconditions.checkFound(users.findById(user.getId()));
        Preconditions.validUserLogging(validEmail(user));
        if(usersLogs.findById(user.getId())!=null)
            usersLogs.login(user);
        usersLogs.login(user);
    }

    @RequestMapping(value="/{id:.+}", method=RequestMethod.DELETE)
    public void logout(@PathVariable String id) {
        Preconditions.checkFound(usersLogs.findById(id));
        usersLogs.logout(id);
    }

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public UserLogging [] getAll() {
        List<UserLogging> logs = usersLogs.getAll();
        return logs.toArray(new UserLogging[logs.size()]);

    }

    // Tests if the email is valid - not null and different than empty
   	private boolean validEmail(UserLogging user) {
        Preconditions.checkFound(user);
   		if(user.getId() == null || user.getId() == "")
   			return false;
   		User u = users.findById(user.getId());
   		if(u == null)
   			return false;
   		else {
            if(u.getPassword().equals(user.getPassword()))
   				return true;
   			else
   				return false;
   		}
    }
}
