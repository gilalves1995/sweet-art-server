package main.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{

    User findById(String id);

}
