package com.horl.exception;

public class AccessDenied extends BookingException {

    public static final String MESSAGE = "권한이 없습니다. ㅠ.ㅠ";

    public AccessDenied() {
        super(MESSAGE);
    }

    public AccessDenied(Throwable cause) {
        super(MESSAGE, cause);
    }

    public AccessDenied(String message) {
        super(message);
    }

    @Override
    public int statusCode() {
        return 403;
    }
}
