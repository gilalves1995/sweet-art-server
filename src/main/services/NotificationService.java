package main.services;

import main.model.Notification;

public interface NotificationService {

    void addNotification(Notification notification);

    Notification [] findByReceiver(String receiver);

    Notification findById(int id);

    void seeNotification(Notification notification);

    void markAsSubmitted(Notification n);

}
