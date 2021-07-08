package com.horl.exception;

import lombok.Getter;

@Getter
public abstract class BookingException extends RuntimeException {

    public BookingException(String message) {
        super(message);
    }

    public BookingException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract int statusCode();
}
