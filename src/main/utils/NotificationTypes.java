package main.utils;

public class NotificationTypes {

    public static final String BID = "BID";
    public static final String ANSWER = "ANSWER";
    public static final String CONFIRMATION = "CONFIRMATION";

    public static boolean exists(String type) {
        return type.equals(BID) || type.equals(ANSWER) || type.equals(CONFIRMATION);
    }
}
