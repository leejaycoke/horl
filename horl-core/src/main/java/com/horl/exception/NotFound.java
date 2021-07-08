package com.horl.exception;

public class NotFound extends BookingException {

    public static final String MESSAGE = "찾을 수 없습니다.";

    public NotFound() {
        super(MESSAGE);
    }

    public NotFound(String message) {
        super(message);
    }

    public NotFound(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 404;
    }
}
