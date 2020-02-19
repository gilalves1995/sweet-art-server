package main.services;

import main.model.User;
import main.model.UserLogging;
import main.model.UserLoggingRepository;
import main.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLoggingServiceClass implements UserLoggingService {

    @Autowired
    UserLoggingRepository repository;

    @Override
    public void login(UserLogging user) {
        repository.save(user);
    }

    @Override
    public void logout(String id) {
        repository.delete(id);
    }

    @Override
    public UserLogging findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<UserLogging> getAll() {
        return (List)repository.findAll();
    }

}
