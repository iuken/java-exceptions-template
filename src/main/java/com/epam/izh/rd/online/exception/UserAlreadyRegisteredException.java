package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Throwable {
    public UserAlreadyRegisteredException(String message) {
        super(message);
    }
}
