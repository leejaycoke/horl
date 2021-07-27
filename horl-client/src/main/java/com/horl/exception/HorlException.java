package com.horl.exception;

public abstract class HorlException extends RuntimeException {

    public HorlException() {
    }

    public HorlException(String message) {
        super(message);
    }

    public HorlException(String message, Throwable cause) {
        super(message, cause);
    }
}
