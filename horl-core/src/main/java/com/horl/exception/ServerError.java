package com.horl.exception;

public class ServerError extends BookingException {

    public static final String MESSAGE = "서버 에러가 발생했습니다 ㅠ.ㅠ";

    public ServerError(Throwable cause) {
        super(MESSAGE, cause);
    }

    @Override
    public int statusCode() {
        return 500;
    }
}
