package com.horl.exception;

public class UserNotFound extends BookingException {

    public static final String MESSAGE = "사용자를 찾을 수 없습니다.";

    public UserNotFound() {
        super(MESSAGE);
    }

    public UserNotFound(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 404;
    }
}
