package com.codesquad.sidedish.exception;

public class NotFoundException extends ApplicationException {

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
