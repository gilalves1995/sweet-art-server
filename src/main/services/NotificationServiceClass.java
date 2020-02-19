package main.services;


import main.model.Notification;
import main.model.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceClass implements NotificationService {

    @Autowired
    NotificationRepository repository;

    @Override
    public void addNotification(Notification notification) {
        repository.save(notification);
    }

    @Override
    public Notification [] findByReceiver(String receiver) {
        List<Notification> list = (List) repository.findByReceiver(receiver);
        return list.toArray(new Notification[list.size()]);
    }

    @Override
    public Notification findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void seeNotification(Notification notification) {
        Notification n = repository.findOne(notification.getId());
        n.seeNotification();
        repository.save(n);
    }

    @Override
    public void markAsSubmitted(Notification n) {
        Notification toMark = repository.findOne(n.getId());
        toMark.markAsSubmitted();
        repository.save(toMark);
    }
}
