package main.utils;

public class Statuses {
    public static final String ABLE = "Available to sale";
    public static final String NOT_ABLE = "Not available to sale";
    public static final String SOLD = "Sold";
    public static final String WAITING_TRANSACTION = "Waiting Transaction";

    public static boolean exists(String status) {
        return status.equals(ABLE) || status.equals(NOT_ABLE) || status.equals(SOLD) || status.equals(WAITING_TRANSACTION);
    }
}
