package com.horl.exception;

public class InvalidCredential extends BookingException {

    public static final String MESSAGE = "아이디 혹은 비밀번호가 옳바르지 않습니다.";

    public InvalidCredential(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 400;
    }
}
