package main.builders;

import main.model.Notification;
import main.model.UserToken;

public class NotificationTokenBuilder {

    private Notification notification;
    private UserToken token;

    public NotificationTokenBuilder() {}

    public NotificationTokenBuilder(Notification notification, UserToken token) {

        this.notification = notification;
        this.token = token;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public UserToken getToken() {
        return token;
    }

    public void setToken(UserToken token) {
        this.token = token;
    }
}
