package com.codesquad.sidedish.exception;

public class CategoryNotFoundException extends NotFoundException {

    public CategoryNotFoundException(ErrorCode errorCode) {
        super(ErrorCode.CATEGORY_NOT_FOUND);
    }
}
