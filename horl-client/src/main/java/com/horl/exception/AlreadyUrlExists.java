package com.horl.exception;

public class AlreadyUrlExists extends HorlException {

    private static final String MESSAGE = "이미 존재하는 주소입니다.";

    public AlreadyUrlExists() {
        super(MESSAGE);
    }
}
