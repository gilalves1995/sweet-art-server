package main.utils;


public enum Messages {
    // Error messages
    INVALID_NAME("Invalid Argument: name must not be empty."),
    INVALID_USER("User was not added: Invalid argument."),
    INVALID_USER_LOGGING("User not authorized: Invalid arguments."),
    INVALID_ART_PIECE("Art piece was not added: Invalid argument."),
    USER_NOT_LOGGED("User is not logged in."),
    INVALID_METHOD_USER("User not able to see this information."),
    USER_NOT_ARTIST("User is not an artist.");

    private String message;
    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
