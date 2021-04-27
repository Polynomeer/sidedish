package com.codesquad.sidedish.exception;

public class ItemNotFoundException extends NotFoundException {

    public ItemNotFoundException(ErrorCode errorCode) {
        super(ErrorCode.ITEM_NOT_FOUND);
    }
}
