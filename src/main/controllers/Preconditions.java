package main.controllers;

// Inspired by: http://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration

import main.exceptions.*;
import main.model.UserLogging;
import main.utils.Messages;

public class Preconditions {
    public static <T> T checkFound(T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }

    public static <T> T checkNotFound(T resource) {
            if (resource != null) {
                throw new ResourceFoundException();
            }
            return resource;
        }

    public static <T> T notNull(T resource) {
        if (resource == null) {
            throw new BadRequestException();
        }
        return resource;
    }

    /*
    public static void checkCondition(boolean cond) {
        if (!cond) {
            throw new BrokenPrecondition();
        }
    }
    */

    // Checks if an argument is valid - if condition is false, than throw exception with message
    public static void validArgument(boolean condition, String message) {
        if(!condition)
            throw new IllegalArgumentException(message);
    }

    // Checks if the art piece is valid.
    public static void validArtPiece(boolean valid) {
        if(!valid) {
            throw new BrokenPrecondition(Messages.INVALID_ART_PIECE.getMessage());
        }
    }

    // Checks if the user is valid.
    public static void validUser(boolean valid) {
        if(!valid) {
            throw new BrokenPrecondition(Messages.INVALID_USER.getMessage());
        }
    }

    // Checks if the user is valid.
    public static void validUserLogging(boolean valid) {
        if(!valid) {
            throw new BrokenPrecondition(Messages.INVALID_USER_LOGGING.getMessage());
        }
    }

    public static void isUserLogged(boolean valid) {
        if(!valid)
            throw new ForbiddenException(Messages.USER_NOT_LOGGED.getMessage());
    }

    public static void isUserAnArtist(boolean valid) {
        if(!valid)
            throw new ForbiddenException(Messages.USER_NOT_ARTIST.getMessage());
        }

    public static void isTheRightUser(boolean valid) {
        if(!valid)
            throw new ForbiddenException(Messages.INVALID_METHOD_USER.getMessage());
        }



}