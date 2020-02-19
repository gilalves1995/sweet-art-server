package main.services;

import main.model.User;
import main.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceClass implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User [] findAll() {
        List<User> list = new ArrayList<>();
        for(User item: repository.findAll()) {
            list.add(item);
        }
        return list.toArray(new User[list.size()]);
    }

    @Override
    public void create(User user) {
        repository.save(user);
    }

    @Override
    public void update(User u) {
        User user = repository.findById(u.getId());
        user.setUsername(u.getUsername());
        user.setArtist(u.isArtist());
        user.setGender(u.getGender());
        user.setPassword(u.getPassword());
        user.setPhone(u.getPhone());
        repository.save(user);
    }

    @Override
    public User findById(String email) {
        return repository.findById(email);
    }

}
