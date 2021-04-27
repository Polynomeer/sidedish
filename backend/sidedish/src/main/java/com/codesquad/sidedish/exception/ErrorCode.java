package com.codesquad.sidedish.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    ITEM_NOT_FOUND(HttpStatus.NOT_FOUND, "Cannot find item"),
    CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "Cannot find category"),
    OUT_OF_STOCK(HttpStatus.BAD_REQUEST, "Out of stock");

    private final HttpStatus httpStatus;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}
