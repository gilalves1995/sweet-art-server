package main.model;

import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository<Notification, Integer>{

    Iterable <Notification> findByReceiver(String receiver);

    Notification findById(int id);

}
