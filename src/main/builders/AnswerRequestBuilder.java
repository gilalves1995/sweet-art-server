package main.builders;

import main.model.Notification;
import org.mockito.stubbing.Answer;

public class AnswerRequestBuilder {

    private Notification notification;
    private int requestId;


    public AnswerRequestBuilder() {}

    public AnswerRequestBuilder(Notification notification, int requestId) {
        this.notification = notification;
        this.requestId = requestId;
    }

    public Notification getNotification() {
        return notification;
    }

    public int getRequestId() {
        return requestId;
    }
}
