package com.horl.exception;

public class Unauthorized extends BookingException {

    public static final String MESSAGE = "로그인이 필요합니다.";

    public Unauthorized() {
        super(MESSAGE);
    }

    public Unauthorized(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 401;
    }
}
