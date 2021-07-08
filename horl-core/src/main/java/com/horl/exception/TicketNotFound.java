package com.horl.exception;

public class TicketNotFound extends NotFound {

    public static final String MESSAGE = "티켓을 찾을 수 없습니다.";

    public TicketNotFound() {
        super(MESSAGE);
    }

    @Override
    public int statusCode() {
        return 404;
    }
}
