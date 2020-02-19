package main.model;

import org.springframework.data.repository.CrudRepository;

public interface UserLoggingRepository extends CrudRepository<UserLogging, String>{

   UserLogging findById(String id);

   Iterable<UserLogging> findAll();

}