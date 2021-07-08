package com.horl.exception;

public class CoordinatorNotFound extends NotFound {

    public static final String MESSAGE = "코디네이터를 찾을 수 없습니다. :<";

    public CoordinatorNotFound() {
        super(MESSAGE);
    }
}
