package com.horl.exception;

public class InvalidRequest extends BookingException {

    public static final String MESSAGE = "잘못된 요청입니다.";

    public InvalidRequest() {
        super(MESSAGE);
    }

    public InvalidRequest(String message) {
        super(message);
    }

    public InvalidRequest(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 400;
    }
}
